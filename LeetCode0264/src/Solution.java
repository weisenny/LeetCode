class Solution {
    public static int nthUglyNumber(int n) {
        int []ai=new int [n];
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        ai[0]=1;
        int temp;
        for (int i = 1; i < n; i++) {
            temp = Math.min(Math.min(ai[p2] * 2, ai[p3] * 3), ai[p5] * 5);
            ai[i]=temp;
            if (temp == ai[p2] * 2)
                p2++;
            if (temp == ai[p3] * 3)
                p3++;
            if (temp == ai[p5] * 5)
                p5++;


        }
        return ai[n-1];
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
}