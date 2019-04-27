import java.util.ArrayList;
import java.util.List;

class Solution {
    int[] row;
    int[] col;
    int[] up;
    int[] down;
    List<List<Integer>> li;
    ArrayList<Integer> ai;
    int count = 0;

    public int totalNQueens(int n) {
        row = new int[n + 1];
        col = new int[n + 1];
        up = new int[n * 2 + 1];//2--16
        down = new int[n * 2 + 1];//-7--7
        li = new ArrayList<>();
        ai = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            row[i] = 0;
            col[i] = 0;

        }
        for (int i = 0; i < 2 * n + 1; i++) {
            up[i] = 0;
            down[i] = 0;

        }
        search(0, n);


        return count;

    }

    public void search(int layer, int n) {

        for (int i = 0; i < n; i++) {

            if (col[i + 1] == 0 && up[layer + i + 2] == 0 && down[layer - i + n] == 0) {
                if (layer == n - 1) {
                    count++;
                    return;


                } else {
                    col[i + 1] = 1;
                    up[layer + i + 2] = 1;
                    down[layer - i + n] = 1;

                    search(layer + 1, n);
                    col[i + 1] = 0;
                    up[layer + i + 2] = 0;
                    down[layer - i + n] = 0;

                }
            }
        }
    }
}

class main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.print(s.totalNQueens(8));
    }
}