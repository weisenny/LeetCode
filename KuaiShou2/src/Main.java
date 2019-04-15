// 本题为考试单行多行输入输出规范示例，无需提交，不计分。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int multi = 1;
        int ii = 0;
        for (int i = 1; i <= n; i++) {
           ii = testint(i);
            multi = multi* ii;
            multi=testint(multi);
        }

        System.out.println(multi);
    }


    public static int testint(int multi) {
        int t = 0;
        while (t == 0) {
            t = multi % 10;
            multi = multi / 10;
        }
        return t;

    }
}