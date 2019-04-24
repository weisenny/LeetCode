class Solution {
    public static int findKthLargest(int[] nums, int k) {
        return find(nums,0,nums.length-1,nums.length-k);


    }
    public static int find (int[] nums, int begin, int end,int k){
        if(begin==end)
            return nums[begin];
        int temp=nums[begin];
        int i=begin;
        int j=end;
        while(i<j)
        {
            while(i<j&&nums[j]>=temp) j--;

            while(i<j&&nums[i]<=temp) i++;
            swap(nums,i,j);

        }
        swap(nums,i,begin);
        if(i==k)
            return temp;
        else if(i>k)
           return find(nums,begin,i-1,k);
        else
           return find(nums,i+1,end,k);


    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }


    public static void main(String[] args) {
        int[] nums = {4, 9, 53, 8, 7, 1, 3, 2};
        System.out.println(findKthLargest(nums, 7));
    }
}

//PirorityQueue min-heap
//    public static int findKthLargest(int[] nums, int k) {
//        PriorityQueue<Integer> pi = new PriorityQueue<>();
//        for (int i = 0; i < k; i++) {
//            pi.add(nums[i]);
//
//        }
//        for (int i = k; i < nums.length; i++) {
//            if (nums[i] > pi.peek()) {
//                pi.poll();
//                pi.add(nums[i]);
//            }
//
//
//        }
//        return pi.peek();
//
//
//    }