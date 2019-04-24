class Solution {
    public static String multiply(String num1, String num2) {
        String sum ="";
        if(num1.equals("0")||num2.equals("0"))
            return "0";
        for (int i = 0; i < num1.length(); i++) {
            StringBuilder onesum = new StringBuilder();
            int cin = 0;
            for (int j = 0; j < num2.length(); j++) {
                int rawmulti = (num1.charAt(num1.length() - 1 - i) - '0') * (num2.charAt(num2.length() - 1 - j) - '0') + cin;
                onesum.append(rawmulti%10);
                cin = rawmulti / 10;



            }
            if(cin!=0)
            onesum.append(cin);
           onesum= onesum.reverse();
            for (int k = 0; k < i; k++) {
                onesum.append(0);

            }

            sum = add(onesum.toString(),sum);
            //   System.out.println(onesum);


        }

        return sum;
    }

    public static String add(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
       // int length = num1.length() < num2.length() ? num1.length() : num2.length();
        int maxlength = num1.length() > num2.length() ? num1.length() : num2.length();

        int cin = 0;

        for (int i = 0; i < maxlength; i++) {
            int raw =0;
            if(i<num1.length()&&i<num2.length())
                raw = (num1.charAt(num1.length() - 1 - i) - '0') + (num2.charAt(num2.length() - 1 - i) - '0') + cin;
            else if(i<num1.length())
                raw=num1.charAt(num1.length() - 1 - i)-'0'+cin;
            else if (i<num2.length())
                raw=num2.charAt(num2.length() - 1 - i)-'0'+cin;
            else
                raw=cin;
            sb.append(raw % 10);
            cin = raw / 10;

        }
        if(cin!=0)
            sb.append(cin);


        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "11";
        String s2 = "900";
        //System.out.println(add(s1, s2));
        System.out.println(multiply(s1, s2));


    }
}