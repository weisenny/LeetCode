import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
      //  int i=0;
        int j=nums.length-1;
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();


        int[] res=new int[2];
        res[0]=0;
        res[1]=0;

        for (int i = 0; i < nums.length ; i++) {
            if(hm.containsKey(target-nums[i]))
            {
                res[0]=(int )hm.get(target-nums[i]) ;
                res[1]=i;
                break;
            }
            else hm.put(nums[i],i);


        }




        return res;}

        public static void main (String [] args){
        int [] i={3,2,4};
        System.out.println(twoSum(i,6)[0]);
            System.out.println(twoSum(i,6)[1]);
        }
}