import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static List<Integer> findSubstring(String s, String[] words) {
        final List<Integer> indexes = new ArrayList<>();
        if (words.length == 0)
            return indexes;
        Map<String, Integer> counts = new HashMap<>();
        for (final String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        final int n = s.length(), num = words.length, len = words[0].length();
        int i = 0;
        while (i < n - num * len + 1) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            while (j < num) {
                String word = s.substring(i + j * len, i + (j + 1) * len);
                if (counts.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    if (seen.get(word) > counts.getOrDefault(word, 0)) {
                        break;
                    }
                } else {
                    //i = i + (j + 1) * len - 1;
                    break;
                }
                j++;
            }
            if (j == num) {
                indexes.add(i);
            }
            System.out.println(i);
           i++;


        }
        return indexes;
    }


    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        System.out.println("kk" + findSubstring(s, words));
    }
}