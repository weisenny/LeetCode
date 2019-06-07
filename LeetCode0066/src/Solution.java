class Solution {
    public int[] plusOne(int[] digits) {
        int cin = 1;
        int temp = 0;
        for (int i = digits.length - 1; i > 0; i--) {
            temp = (digits[i] + cin) / 10;
            digits[i] = (digits[i] + cin) % 10;
            cin = temp;
        }
        if (cin == 1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for (int i = 1; i < digits.length; i++) {
                res[i] = digits[i - 1];
            }
            return res;
        }


        return digits;
    }
}