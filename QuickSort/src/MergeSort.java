public class MergeSort {
    public static void main(String[] args) {
        int[] unsorted = new int [200];
        for (int i = 0; i < 200; i++) {
            unsorted[i] = (int) (Math.random() * 100);
        }
        p(unsorted);
        MergeSort(unsorted, 0, unsorted.length - 1);

        p(unsorted);
    }

    /*
    归并排序
    稳定
    无元素归位



     */
    public static void MergeSort(int[] nums, int begin, int end) {
        if (begin == end)
            return;
        int mid = (begin + end) / 2;
        MergeSort(nums, begin, mid);
        MergeSort(nums, mid + 1, end);
        Merge(nums, begin, end, mid);
    }

    public static void Merge(int[] nums, int begin, int end, int mid) {
        int[] temp = new int[end - begin + 1];
        int j = 0, k = 0;
        for (int i = 0; i < end - begin + 1; i++) {
            if (begin + j > mid) {
                temp[i] = nums[mid + 1 + k];
                k++;
            } else if (mid + 1 + k > end) {
                temp[i] = nums[begin + j];
                j++;
            } else if (nums[begin + j] <= nums[mid + 1 + k]) {//稳定
                temp[i] = nums[begin + j];
                j++;

            } else if (nums[begin + j] > nums[mid + 1 + k]) {
                temp[i] = nums[mid + 1 + k];
                k++;

            }

        }
        for (int i = 0; i < end - begin + 1; i++) {
            nums[begin+i]=temp[i];
        }

    }

    public static void p(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + "  ");


        }
        System.out.println(" ");
    }
}
