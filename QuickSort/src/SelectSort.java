public class SelectSort {

    public static void main(String[] args) {
        int[] unsorted = new int[10];
        for (int i = 0; i < 10; i++) {
            unsorted[i] = (int) (Math.random() * 1000);
        }
        // qsort(unsorted);
        SelectSort(unsorted);

        p(unsorted);
    }

    /*


    选择排序
    不稳定

    3‘ 4 3 1 2
    由于要将1归位
    1 4 3 3’ 2
    每一趟都局部有序，每次最小的归位

    比较次数O(N^2) 与初始状态无关

     */
    public static void SelectSort(int[] nums) {
        boolean fin=true;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i; j < length; j++) {

                if (nums[j] < nums[min]) {
                    min = j;


                }

            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
            p(nums);
        }
    }

    public static void p(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + "  ");


        }
        System.out.println(" ");
    }
}

