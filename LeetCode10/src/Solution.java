
import java.util.*;


//

class Solution {
    public static boolean isMatch(String str, String pattern) {

        return match(str, 0, pattern, 0);

        // return false;


    }

    public static boolean match(String str, int s, String pattern, int p) {
        //System.out.println(str + ' ' + s + ' ' + pattern + ' ' + p);
        if (s == str.length() && p == pattern.length())
            return true;

        if (s < str.length() && p == pattern.length())
            return false;
        //if (s <= str.length() && p < pattern.length())
        if (p < pattern.length() - 1 && pattern.charAt(p + 1) == '*')
            if (s < str.length() && (pattern.charAt(p) == str.charAt(s) || (pattern.charAt(p) == '.')))
                return match(str, s, pattern, p + 2)//case1:a,.*b
                        || match(str, s + 1, pattern, p)//case2:aaa,a*b
                        || match(str, s + 1, pattern, p + 2);//case1:ab,a*b
            else
                return match(str, s, pattern, p + 2);


        if (s < str.length() && (pattern.charAt(p) == str.charAt(s) || (pattern.charAt(p) == '.')))
            return match(str, s + 1, pattern, p + 1);//


        return false;


    }


    public static void main(String[] args) {
        //  "aa";

        String s = "bbbba";
        String p = ".*a*a";
        // ".*";

        System.out.println(isMatch(s, p));
    }


}