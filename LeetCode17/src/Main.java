import java.util.*;

public class Main {


    public static List<String> letterCombinations(String digits) {
        List<String> ls = new ArrayList<String>();
        if (digits.isEmpty())
            return ls;
        char[] chars = digits.toCharArray();

        char[][] dis = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
                {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        StringBuilder newsb = new StringBuilder();

        generate(ls, newsb, 0, chars, dis);


        return ls;
    }

    public static void generate(List<String> ls, StringBuilder sb, int pos, char[] chars, char[][] dis) {


        int m = (int) chars[pos] - '0';
        for (int i = 0; i < dis[m].length; i++) {
            StringBuilder newsb = new StringBuilder(sb);
            newsb.append(dis[m][i]);
            if (pos == chars.length - 1)
                ls.add(newsb.toString());
            else
                generate(ls, newsb, pos + 1, chars, dis);

        }


    }


    public static void main(String[] args) {
        System.out.println(letterCombinations("28883"));
    }
}
