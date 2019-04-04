class Solution {
    public static  int divide(int dividend, int divisor) {

        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        if(dividend>0 && divisor<0)
            return  -div(dividend,(0-divisor));
        else if(dividend<0 && divisor>0)
            return  -div(-dividend,divisor);
        else
            if(dividend<0 && divisor<0)
            return  div(-dividend,-divisor);
       else return  div(dividend,divisor);

    }
    public static int div(int dividend, int divisor) {
        // base case
        System.out.println(dividend+"  "+divisor);
        if(divisor < dividend) return 0;
        // get highest digit of divisor
        int cur = 0, res = 0;
        //System.out.println(dividend+"  "+divisor);
        while((divisor << cur) >= dividend && divisor << cur < 0 && cur < 31) cur++;
        System.out.println(cur-1);
        res = dividend - (divisor << cur-1);
        if(res > divisor) return 1 << cur-1;
        return (1 << cur-1)+divide(res, divisor);


    }

    public static void main (String [] args){
    //    Solution sl=new Solution();
        System.out.println(divide(7 ,3));

    }
}



