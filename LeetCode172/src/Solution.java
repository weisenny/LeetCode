class Solution {
    public int trailingZeroes(int n) {
        int j=0,k=0;
        int num2=0;
        int num5=0;
        for (int i = n; i>=1; i--) {
            j=i;
            k=i;
            while(k>1&&k%2==0)
            {
                k=k/2;
                num2++;
            }
            while(j>1&&j%5==0)
            {
                j=j/5;
                num5++;
            }


        }
        return Math.max(num2,num5);

    }
}