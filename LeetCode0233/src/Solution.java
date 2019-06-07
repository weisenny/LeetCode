class Solution {


    public  int countDigitOne(int n) {
        if(n<=0)
            return 0;
        Integer in = new Integer(n);
        String num = in.toString();

        int length = num.length();
        int[] base = new int[length];
        base[0]=0;

        for (int i = 1; i < length; i++) {
            base[i]=10*base[i-1]+1*(int)Math.pow(10,i-1);

        }
        int t;
        int sum=0;

        for (int i = 0; i <length ; i++) {
            t=num.charAt(i)-'0';
            if(t==1)
                sum+=1+base[length-1-i]+n%(int)Math.pow(10,length-1-i);
            else if(t>1)
                sum+=t*base[length-1-i]+(int)Math.pow(10,length-1-i);


        }

        return sum;
    }


}