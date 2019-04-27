import java.util.ArrayList;
import java.util.List;

class Solution {
    int[] row;
    int[] col;
    int[] up;
    int[] down;
    List<List<Integer>> li;
    ArrayList<Integer> ai;

    public List<List<String>> solveNQueens(int n) {
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
        List<List<String>> res = new ArrayList<>();
        StringBuilder sb;
        List<String> ls;
        for (List<Integer> a : li
                ) {
            ls = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (a.get(i) == j)
                        sb.append('Q');
                    else
                        sb.append('.');

                }
                ls.add(sb.toString());

            }
            res.add(ls);
        }

        return res;

    }

    public void search(int layer, int n) {
        ArrayList<Integer> newai;
        for (int i = 0; i < n; i++) {

            if (col[i + 1] == 0 && up[layer + i + 2] == 0 && down[layer - i + n] == 0) {
                if (layer == n - 1) {
                    ai.add(i);
                    newai = new ArrayList<>(ai);
                    li.add(newai);
                    ai.remove(layer);
                    return;


                } else {
                    col[i + 1] = 1;
                    up[layer + i + 2] = 1;
                    down[layer - i + n] = 1;
                    ai.add(i);
                    search(layer + 1, n);
                    col[i + 1] = 0;
                    up[layer + i + 2] = 0;
                    down[layer - i + n] = 0;
                    ai.remove(layer);
                }
            }
        }
    }
}

class main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.print(s.solveNQueens(8));
    }
}