class Solution {
//    public static void swap(int[] tree, int[] res, int[] sum) {
//
//
//    }


    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 4, 1, 4, 1, 2, 3};
        System.out.println(totalFruit(nums));
    }

    public  static int totalFruit(int[] tree) {
        int res = 0, cur = 0, count_b = 0, a = 0, b = 0;
        for (int c : tree) {
            cur = c == a || c == b ? cur + 1 : count_b + 1;
            count_b = c == b ? count_b + 1 : 1;
            if (b != c) {
                a = b;
                b = c;
            }
            res = Math.max(res, cur);
        }
        return res;
    }
}