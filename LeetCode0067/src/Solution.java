import java.util.Stack;

class Solution {
    public static String addBinary(String a, String b) {
        int minlen = a.length() < b.length() ? a.length() : b.length();
        String s = a.length() > b.length() ? a : b;
       StringBuilder sc=new StringBuilder();
        int cin = 0;
        int res = 0;
        int i = 0;
        for (i = 0; i < s.length(); i++) {
            if (i < minlen)
                res = a.charAt(a.length()-1 - i) - '0' + b.charAt(b.length() -1- i) - '0' + cin;
            else
                res = s.charAt(s.length() -1- i)-'0'+cin;

            if (res == 3) {
                cin = 1;
                sc.append('1');
            } else if (res == 2) {
                cin = 1;
                sc.append('0');
            } else if (res == 1) {
                cin = 0;
                 sc.append('1');
            } else {

                cin = 0;
                 sc.append('0');
            }


        }

        if (cin == 1)
            sc.append('1');
        return sc.reverse().toString();


    }
    public static void main (String [] args){
System.out.println(addBinary("1","11"));
    }
}