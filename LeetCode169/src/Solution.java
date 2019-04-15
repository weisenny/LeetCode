class Solution {
    public int majorityElement(int[] nums) {
        int max=nums[0];
        int n=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==max)
                n++;
            else if(n==0)
            {
                max=nums[i];
                n=1;
            }

            else n--;


        }
        return max;
    }
}
//     1,2,1
//n=   1,0,1
//max= 1,1,1

//     1,2,2
//n=   1,0,1
//max= 1,1,2