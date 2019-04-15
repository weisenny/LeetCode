class Solution {
    public static void main (String [] args){

    }
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!coltest(board, i) || !squaretest(board, i) || !rowtest(board, i))
                return false;
        }
        return true;

    }

    public static boolean coltest(char[][] board, int i) {
        boolean[] b = new boolean[10];
        for (int k = 0; k < 10; k++)
            b[k] = false;
        for (int k = 0; k < 9; k++) {
            if (board[k][i] <= '9' && board[k][i] >= '0')
                if (b[board[k][i] - '0'] == false)
                    b[board[k][i] - '0'] = true;
                else
                    return false;


        }
        return true;


    }

    public static boolean squaretest(char[][] board, int s) {
        boolean[] b = new boolean[10];
        int h = s % 3;
        int shu = s / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[3 * h + i][3 * shu + j] <= '9' && board[3 * h + i][3 * shu + j] >= '0')
                    if (b[board[3 * h + i][3 * shu + j] - '0'] == false)
                        b[board[3 * h + i][3 * shu + j] - '0'] = true;
                    else
                        return false;


            }

        }
        return true;


    }

    public static boolean rowtest(char[][] board, int i) {
        boolean[] b = new boolean[10];
        for (int k = 0; k < 10; k++)
            b[k] = false;
        for (int k = 0; k < 9; k++) {
            if (board[i][k] <= '9' && board[i][k] >= '0')
                if (b[board[i][k] - '0'] == false)
                    b[board[i][k] - '0'] = true;
                else
                    return false;


        }
        return true;


    }
}