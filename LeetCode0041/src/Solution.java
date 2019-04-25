class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]==i+1||nums[i]>nums.length||nums[i]<1)
                i++;
            else if(nums[i]!=i+1)

                swap(nums,i,nums[i]-1);
            else i++;
        }
        i = 0;
        while(i < nums.length && nums[i] == i+1) i++;
        return i+1;

//
    }
    public  void swap (int [] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
}