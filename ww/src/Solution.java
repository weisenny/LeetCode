import java.util.ArrayList;

public class Solution {
    public static int max(int n, int p, int x) {

        int[][] map = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++)

                map[i][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < i; j++)

            {
                if (i % j == 0)
                    map[i][j] = 1;
            }
        }

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++)

                map[i][j] = map[j][i];
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++)

                System.out.print(map[i][j]);
            System.out.println("  ");
        }
        ArrayList<Integer> group = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> groups = new ArrayList<ArrayList<Integer>>();
        find(group, groups, p, n, p, x,x, map);
        System.out.println(groups);
        return groups.size();


    }


    public static void find(ArrayList<Integer> group, ArrayList<ArrayList<Integer>> groups,
                            int i, int n, int p, int x, int oldx,int[][] map) {

        ArrayList<Integer> gr = new ArrayList<Integer>();
        for (int t = 0; t < group.size(); t++) {
            gr.add(group.get(t));
        }

        if (x >= 0 && i == p&&x!=oldx) {
            gr.add(p);
            groups.add(gr);
            // gr.remove(p);
            //return;
        }
        else
            gr.add(i);
        if (x <= 0)
            return;


        //
        //  gr = (ArrayList) group.clone();




      //  System.out.println("  " + x);
        int k = 0;
        for (k = 0; k < n + 1; k++) {
            // System.out.println(k);
            if (map[i][k] == 1) {


                find(gr, groups, k, n, p, x - 1,oldx, map);

            }


        }


    }
    // return 0;


    public static void main(String[] args) {
        System.out.println(max(3, 2, 2));
    }
}
