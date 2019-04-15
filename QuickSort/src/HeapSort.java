public class HeapSort {
    public static void main(String[] args) {
        int[] unsorted = new int[30000];
        for (int i = 0; i < 30000; i++) {
            unsorted[i] = (int) (Math.random() * 10000);
        }
        //int[] unsorted = {3, 5, 1, 8, 7, 2, 0, 9};       // qsort(unsorted);
        long begintime = System.currentTimeMillis();

//运算代码
        HeapSort(unsorted);
        long endtime = System.currentTimeMillis();

        long costTime = (endtime - begintime);

        System.out.println(costTime);
        p(unsorted);
    }

    /*


    堆排序


     */
    public static void HeapSort(int[] nums) {
        makeheap(nums, nums.length - 1);

        for (int i = nums.length - 1; i > 0; i--) {
            swap(nums, 0, i);
            adjustheap(nums, i - 1);


        }

    }

    public static void adjustheap(int[] arr, int end) {
        int index = 0;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        while (left <= end) {
            int largestIndex;
            //判断孩子中较大的值的索引（要确保右孩子在size范围之内）
            if (arr[left] < arr[right] && right <= end) {
                largestIndex = right;
            } else {
                largestIndex = left;
            }
            //比较父结点的值与孩子中较大的值，并确定最大值的索引
            if (arr[index] > arr[largestIndex]) {
                largestIndex = index;


                //如果父结点索引是最大值的索引，那已经是大根堆了，则退出循环

                break;
            }
            //父结点不是最大值，与孩子中较大的值交换
            swap(arr, largestIndex, index);
            //将索引指向孩子中较大的值的索引
            index = largestIndex;
            //重新计算交换之后的孩子的索引
            left = 2 * index + 1;
            right = 2 * index + 2;
        }

    }


    public static void makeheap(int[] nums, int end) {

        for (int i = 0; i <= end; i++) {
            int j = i;
            while (j > 0) {
                if (nums[j] > nums[(j - 1) / 2]) {
                    swap(nums, j, (j - 1) / 2);

                }

                j = (j - 1) / 2;

            }


        }


    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    public static void p(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + "  ");


        }
        System.out.println(" ");
    }
}

