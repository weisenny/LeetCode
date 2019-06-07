class Solution {
    public boolean canJump(int[] nums) {

        boolean[] canreach = new boolean[nums.length];


        for (int i = 0; i < nums.length; i++) {
            canreach[i] = false;
        }
        canreach[0] = true;
        int max=0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(i<=max)
                max=i+nums[i]>max?i+nums[i]:max;


        }
        return max>=nums.length-1?true:false;

    }
}

