public class InsertSort {
    public static void main(String[] args) {
        int[] unsorted = {8, 4, 3, 2, 1, 7};
        // qsort(unsorted);
        InsertSort(unsorted);

        p(unsorted);
    }

    /*
    插入排序
    没有元素归位

     */
    public static void InsertSort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[i]) {//稳定
                    int temp = nums[i];
                    for (int k = i; k > j; k--) {
                        nums[k] = nums[k - 1];
                    }
                    nums[j] = temp;
                }

            }

        }

    }

    public static void p(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + "  ");


        }
        System.out.println(" ");
    }
}
