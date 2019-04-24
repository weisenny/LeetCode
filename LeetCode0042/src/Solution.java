class Solution {
    public static void main(String[] args) {
        int[] can = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(can));

    }

    public static int trap(int[] height) {
        int max = 0;
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            if (max < height[i])
                max = height[i];
        }
        int[] onelayer = new int[height.length];
        for (int j = 1; j <= max; j++) {
            int sum = 0;
            int begin = 0;
            for (int i = 0; i < height.length; i++) {
                if (height[i] < j) {
                    if (begin == 1)
                        sum++;
                } else {
                    res = res + sum;
                    sum = 0;
                    begin = 1;
                }

            }
            System.out.println(res);
        }
        return res;
    }
}