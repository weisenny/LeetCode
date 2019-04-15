public class QuickSort {

    public static void main(String[] args) {
        int[] unsorted = new int[10];
        for (int i = 0; i < 10; i++) {
            unsorted[i] = (int) (Math.random() * 100);
        }
        p(unsorted);
        sort(unsorted,0,unsorted.length-1);


    }

    /*
    快速排序
    有元素归位
    不稳定


     */
    public static void sort(int[] nums, int begin, int end) {
        if (begin >= end)
            return;


        int i = begin;
        int j = end;

        int temp = nums[begin];

        while (i < j) {
            while (i < j && nums[j] >= temp)
                j--;
            while (i < j && nums[i] <= temp)
                i++;
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
        }

        nums[begin] = nums[j];
        nums[j] = temp;

        sort(nums, begin, j - 1);
        sort(nums, j + 1, end);
        p(nums);
    }


    public static void p(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + "  ");


        }
        System.out.println(" ");
    }
}
