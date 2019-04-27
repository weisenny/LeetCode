class Solution {
    public  double pow(double x, int n) {
        if(n==0)
            return 1;
        if (n == 1)
            return x;
        double res = pow(x, n / 2);
        if (n % 2 == 1)
            return res * res * x;
        else
            return res * res;

    }

    public double myPow(double x, int n) {
        if (n < 0) {
            if(n==Integer.MIN_VALUE)
                return 1/pow(x,Integer.MAX_VALUE)*(1/x);
            return 1 / pow(x, -n);
        }
        else
        {
            return pow(x,n);
        }
    }

}