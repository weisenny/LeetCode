import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        String s = "()(()";
        System.out.println(longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
        System.out.println(s);
        if (s.length() == 0)
            return 0;
        int sum = 0;
        Stack<Character> sc = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (!sc.isEmpty()&&sc.peek() == '(') {
                    sc.pop();
                    sum = sum + 2;
                    //System.out.println(sum);

                } else {
                    System.out.println(sum);
                   int mm= longestValidParentheses(s.substring(i+1));
                   return sum >mm?sum:mm;

                }

            } else
                sc.push('(');
        }

        return sum;

    }
}