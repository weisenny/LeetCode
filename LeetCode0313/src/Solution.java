class Solution {
    public static int min(int[] ai, int[] primes, int[] nums) {
        int max = primes[0] * ai[nums[0]];
        for (int i = 0; i < primes.length; i++) {
            max = max < primes[i] * ai[nums[i]] ? max : primes[i] * ai[nums[i]];


        }
        return max;
    }

    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ai = new int[n];
        int[] nums = new int[primes.length];
        for (int i = 0; i < primes.length; i++) {
            nums[i] = 0;

        }
        ai[0] = 1;
        int temp;
        for (int i = 1; i < n; i++) {
            temp = min(ai, primes, nums);
            ai[i] = temp;
            for (int j = 0; j < primes.length; j++) {
                if (temp == primes[j] * ai[nums[j]])
                    nums[j]++;
            }


        }
        return ai[n - 1];
    }


}