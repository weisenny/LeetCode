public class BobSort {
    public static void main(String[] args) {
        int[] unsorted = new int[10];
        for (int i = 0; i < 10; i++) {
            unsorted[i] = i;
        }
        p(unsorted);
        BobSort(unsorted);
        p(unsorted);

    }

    /*
    冒泡排序
    每次都有最大的归位
    稳定
    交换次数数量级：最好O(N) 最坏平均O（N^2)
     */
    public static void BobSort(int[] nums) {
        int length = nums.length;
        boolean    finished = false;
        for (int i = 1; i < length; i++) {
            for (int j = 1; j < length; j++) {
                if (nums[j] < nums[j - 1]) {//稳定
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    finished=true;
                }

            }
            if(!finished)
                break;
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
