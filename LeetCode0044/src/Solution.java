class Solution {
    public static boolean isMatch(String s, String p) {
        if (p.equals("*"))
            return true;

        return Match(s, p, 0, 0);

    }

    public static boolean Match(String s, String p, int i, int j) {

        if (i == s.length() && j == p.length())
            return true;
        else if (j > 0 && j < p.length() && p.charAt(j) == '*' && p.charAt(j - 1) == '*')
            return Match(s, p, i, j + 1);

        else if (j == p.length() - 1 && p.charAt(j) == '*')
            return true;

        else if (i == s.length() && p.charAt(j) == '*')
            return Match(s, p, i, j + 1);
        else if (i == s.length() || j == p.length())
            return false;

        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')
            return Match(s, p, i + 1, j + 1);
        else if (p.charAt(j) == '*')
            return Match(s, p, i+1, j ) //s:aa  p:a*a
                    || Match(s, p, i , j+1);
      //  System.out.println("b");
        return false;


    }

    public static void main(String[] args) {
        String s1 = "abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb";
        String s2 ="*aa*ba*a*bb*aa*ab*a*aaaaaa*a*aaaa*bbabb*b*b*aaaaaaaaa*a*ba*bbb*a*ba*bb*bb*a*b*bb";
       // "ac**e**";
        System.out.println(isMatch(s1, s2));
    }
}