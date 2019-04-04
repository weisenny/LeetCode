class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        for(i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1])
            {
                nums[j]=nums[i];
                j++;

            }
            //nums[j]='\0';


        }
        return j;
    }}
