public class Solution {
public static void main (String [] args){
   // System.out.println(Integer.MAX_VALUE);
System.out.println(myAtoi("21474836486"));
}

    public  static  int myAtoi(String str) {
        char[] cs = str.toCharArray();
        int begin = 0;
       // if(cs.length)
        boolean ispos = true;
        while (cs[begin] == ' ')
            begin++;
        if (cs[begin] == '+')
            begin++;
        else if (cs[begin] == '-') {
            ispos = false;
            begin++;


        }
        int sum = 0;
        int i = begin;
        int flag=0;
        while (i < cs.length) {
            if (cs[i] > '9' || cs[i] < '0')
                break;

            if (sum < Integer.MAX_VALUE / 10
                    ||(ispos&&sum == Integer.MAX_VALUE / 10 && cs[i] - '0' <= Integer.MAX_VALUE % 10)
                    ||(!ispos&&sum == Integer.MAX_VALUE / 10 && cs[i] - '0' <= Integer.MAX_VALUE % 10 + 1))
                sum = sum * 10 + cs[i] - '0';
            else {
                flag=1;
                break;

            }
            i++;




        }

        if(flag==1)
            return  ispos?Integer.MAX_VALUE:Integer.MIN_VALUE;

        return ispos?sum:0-sum;

    }
}

