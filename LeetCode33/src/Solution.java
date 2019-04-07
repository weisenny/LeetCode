class Solution {
    public static int search(int[] nums, int target) {

        if(nums.length==0)
            return -1;

        return find(nums, target, 0, nums.length - 1);
    }


    public static int find(int[] nums, int target, int beginindex, int endindex) {

        if (beginindex == endindex) {
            if (nums[endindex] == target)
                return endindex;
            else return -1;

        }


        int count = 0;

        int midindex = (beginindex + endindex) / 2;
        System.out.println(beginindex + "  " + endindex + "  " + nums[beginindex] +" "+ nums[midindex] + " " + nums[endindex]);

        if (nums[midindex] >= nums[beginindex]) {

            if (target <= nums[midindex] && target >= nums[beginindex])
                count = linearfind(nums, target, beginindex, midindex);
            else
                count = find(nums, target, midindex + 1, endindex);
        } else {
            if (target >= nums[midindex] && target <= nums[endindex])
                count = linearfind(nums, target, midindex , endindex);
            else
                count = find(nums, target, beginindex, midindex);
        }


        return count;
    }

    public static int linearfind(int[] nums, int target, int beginindex, int endindex) {
        System.out.println(beginindex + "  l" + endindex);
        if (beginindex == endindex) {
            if (nums[endindex] == target)
                return endindex;
            else return -1;

        }
        int midindex = (beginindex + endindex) / 2;
        int count = linearfind(nums, target, beginindex, midindex);
        if (count == -1)
            count = linearfind(nums, target, midindex + 1, endindex);


        return count;
    }

    public static void main(String[] args) {

        int[] nums = {5, 1, 3};
        System.out.println(search(nums, 5));
    }
}