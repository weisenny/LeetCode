class Solution {
    public static int[] searchRange(int[] nums, int target) {


        int[] a = {-1, -1};
        if (nums.length == 0)
            return a;
        int midindex = (nums.length-1) / 2;
        if(nums[midindex]==target)
        {
            a[0] = findbeg(nums, target, 0, midindex);
            a[1] = findend(nums, target, midindex, nums.length - 1);
        }else if(nums[midindex]>target){
            a[0] = findbeg(nums, target, 0, midindex);
            a[1] = findend(nums, target, 0, midindex);
        }
        else
        {
            a[0] = findbeg(nums, target, midindex, nums.length - 1);
            a[1] = findend(nums, target, midindex, nums.length - 1);
        }

        return a;
    }


    public static int findbeg(int[] nums, int target, int beginindex, int endindex) {

        if (beginindex == endindex) {
            if (nums[endindex] == target)
                return endindex;
            else return -1;

        }
        if(nums[endindex]<target)
            return -1;
        int midindex = (beginindex + endindex) / 2;

        int count = findbeg(nums, target, beginindex, midindex);
        if (count == -1)
            count = findbeg(nums, target, midindex + 1, endindex);

        return count;
    }

    public static int findend(int[] nums, int target, int beginindex, int endindex) {
        if (beginindex == endindex) {
            if (nums[endindex] == target)
                return endindex;
            else return -1;

        }
        if(nums[beginindex]>target)
            return -1;
        int midindex = (beginindex + endindex) / 2;

        int count = findend(nums, target, midindex + 1, endindex);

        if (count == -1)

            count = findend(nums, target, beginindex, midindex);

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int []res=searchRange(nums, 6);
        System.out.println(res[0]+  "  "+res[1]);
    }
}

//LeetCode35
//class Solution {
//    public int searchInsert(int[] nums, int target) {
//        if(target>nums[nums.length-1])
//            return nums.length;
//        if(target<nums[0])
//            return 0;
//        return linearfind(nums,target,0,nums.length-1);
//
//
//
//
//    }
//     public  int linearfind(int[] nums, int target, int beginindex, int endindex) {
//        //System.out.println(beginindex + "  l" + endindex);
//        if (beginindex == endindex)
//            if(target<=nums[beginindex])
//
//                 return beginindex;
//         else
//         return -1;
//        int midindex = (beginindex + endindex) / 2;
//        int count = linearfind(nums, target, beginindex, midindex);
//        if (count == -1)
//            count = linearfind(nums, target, midindex + 1, endindex);
//
//
//        return count;
//    }
//}