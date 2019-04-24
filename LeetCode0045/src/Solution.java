class Solution {
    public static int jump(int[] nums) {

            int jumps = 0, curEnd = 0, curFarthest = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                curFarthest = Math.max(curFarthest, i + nums[i]);//
                if (i == curEnd) {
                    jumps++;
                    curEnd = curFarthest;
                }
                System.out.println(i+"  "+ curFarthest+"   "+jumps);
            }
            return jumps;
        }

//        int[] steps = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            steps[i] = Integer.MAX_VALUE;
//        }
//        steps[0] = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//
//            for (int j = 1; j <= nums[i]; j++) {
//                if ((j + i) < nums.length)
//                    steps[j + i] = Math.min(steps[j + i], steps[i] + 1);
//
//            }
//            // System.out.println(steps[2]);
//
//        }
//
//        return steps[nums.length - 1];
//
//    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));

    }
}