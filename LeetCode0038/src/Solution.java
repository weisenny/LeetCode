class Solution {
    public static String countAndSay(int n) {
        String s = "1";
        if (n == 1)
            return s;
        for (int i = 2; i <= n; i++) {
            s = read(s);
System.out.println(s);

        }
        return s;

    }

    public static String read(String s) {
        StringBuilder sb = new StringBuilder();
        char be;
        int i = 0;
        int n = 0;
        while (i < s.length()) {
            be = s.charAt(i);
            n = 0;

            while (i < s.length()&&s.charAt(i) == be  ) {
                n++;
                i++;
                System.out.println(i);
            }
            sb.append(n);
            sb.append(be);


        }
        return sb.toString();


    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}