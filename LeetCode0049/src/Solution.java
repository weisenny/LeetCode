import java.util.*;

class Solution {
    public static String charsort(String s) {
        char[] cs = s.toCharArray();
        Arrays.sort(cs);


        return  String.valueOf( cs);


    }

    public static void main(String[] args) {
        String[] ss = {"eat", "tan", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(ss));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String temp = charsort(strs[i]);
            if (hm.containsKey(temp))
                hm.get(temp).add(strs[i]);
            else {
                System.out.println("s");
                ArrayList<String> as = new ArrayList<String>();
                as.add(strs[i]);
                hm.put(temp, as);
            }

        }
        List<List<String>> ls = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> e : hm.entrySet()
                ) {
            ls.add(e.getValue());


        }
        return ls;
    }
}