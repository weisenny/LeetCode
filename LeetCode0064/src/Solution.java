import java.util.ArrayList;
import java.util.PriorityQueue;

class Solution {

    public static void find(int[][] grid, int sum, int i, int j, int []pi) {
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            //System.out.println(sum);

            //max=
          pi[0]=pi[0]<sum+grid[i][j]?pi[0]:sum+grid[i][j];
            return;

        }

        //gone[i][j] = true;
        sum = sum + grid[i][j];

        if ( sum > pi[0])
            return;

        if (i < grid.length - 1) {


            find(grid, sum, i + 1, j, pi);


        }
        if (j < grid[0].length - 1) {


            find(grid, sum, i, j + 1, pi);


        }

        //  gone[i][j] = false;
        sum = sum - grid[i][j];
    }

    public static int minPathSum(int[][] grid) {

        int sum = 0;
      //  PriorityQueue<Integer> pi = new PriorityQueue<>();
        //  boolean[][] gone = new boolean[grid.length][grid[0].length];
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                gone[i][j] = false;
//
//            }
//
//        }
        int [] pi={0,0};
         int max=Integer.MAX_VALUE;
         pi[0]=max;
        find(grid, sum, 0, 0, pi);

        return pi[0];


    }

    public static void main(String[] args) {
        int[][] grid = {{1}};

        System.out.println(minPathSum(grid));
    }

}