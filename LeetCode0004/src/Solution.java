import java.util.HashMap;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int maxl = 0;
        int tempbe = 0;

        for (int i = 0; i < s.length(); i++) {
            if (hm.getOrDefault(s.charAt(i), null) == null) {
                hm.put(s.charAt(i), i);
            } else {
                if (tempbe <= hm.get(s.charAt(i)))
                    tempbe = hm.get(s.charAt(i)) + 1;
                //else tempbe++;
                hm.replace(s.charAt(i), i);


            }
            maxl = Integer.max(maxl, i - tempbe + 1);
            System.out.println(tempbe + " " + maxl);

        }
        return maxl;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("tmmzuxt"));
    }
}