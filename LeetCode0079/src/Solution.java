class Solution {
   
    public  boolean search(char[][] board, char[] cs, int i, int j, int pos) {
        if (pos == cs.length)
        {

            return true;
        }
        boolean t=false;
        char temp = board[i][j];
        board[i][j] = '@';
        if (!t&&i > 0 && board[i - 1][j] == cs[pos])
          t= search(board, cs, i - 1, j, pos + 1);
        if (!t&&j > 0 && board[i][j - 1] == cs[pos])
            t=search(board, cs, i, j - 1, pos + 1);
        if (!t&&i < board.length - 1 && board[i + 1][j] == cs[pos])
           t= search(board, cs, i + 1, j, pos + 1);
        if (!t&&j < board[0].length - 1 && board[i][j + 1] == cs[pos])
           t= search(board, cs, i, j + 1, pos + 1);

        board[i][j] = temp;
        return t;
    }

    public boolean exist(char[][] board, String word) {
        char[] cs = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (cs[0] == board[i][j])
                    if(search(board, cs, i, j, 1))
                        return true;



            }
        }

        return false;
    }
}