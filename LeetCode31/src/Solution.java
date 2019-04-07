import java.util.*;

class Solution {
    public static void nextPermutation(int[] nums) {
        int length = nums.length;
        int min = length - 1;
        int flag=1;
      //  int min = 0;
        for (int j = 0; j < length; j++)
            System.out.println(nums[j]);
        for (int i = length-2; i >=0; i--) {
            if (nums[i] < nums[min])
                min = i;
            if (nums[i] < nums[i + 1]) {
                int k;
                for( k=length-1;k>=i+1;k--)
                    if(nums[k]>nums[i])
                        break;
                if(k==i)
                    k=i+1;


                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                Arrays.sort(nums, i+1, length);
                System.out.println(k+"k"+i);
                flag=0;
                break;

            }

if(flag==1)
    Arrays.sort(nums, 0, length);
        }



        for (int j = 0; j < length; j++)
            System.out.println(nums[j]);
        return;
    }

    public static void main(String[] args) {
        int[] ii ={2,1,5,4,3};
        nextPermutation(ii);

    }
}