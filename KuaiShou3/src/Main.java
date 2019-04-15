import java.util.Scanner;

public class Main {
    public static int stoi(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {

            sum = sum * 10 + (s.charAt(i) - '0');
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String[] ss = s.split(",");
        int x = stoi(ss[0]);
        int y = stoi(ss[1]);


        if (x == y) {
            System.out.println(0);
            return;
        }
        if (x > y) {
            System.out.println(x - y);
            return;
        }
        int[] map = new int[203];
        for (int i = 0; i < 203; i++) {
            map[i] = 500;

        }


        map[x + 101] = 0;


        for (int i = x - 1; i >= -100; i--) {
            if (i % 2 == 0)
                map[i + 101] = Math.min(map[101 + i / 2] + 1,
                        Math.min(map[i + 101 - 1] + 1, map[i + 101 + 1] + 1));
            else
                map[i + 101] =
                        Math.min(map[i + 101 - 1] + 1, map[i + 101 + 1] + 1);


        }
        for (int i = x + 1; i <= 100; i++) {
            if (i % 2 == 0)
                map[i + 101] = Math.min(map[i / 2 + 101] + 1,
                        Math.min(map[i + 101 - 1] + 1, map[i + 101 + 1] + 1));
            else
                map[i + 101] =
                        Math.min(map[i + 101 - 1] + 1, map[i + 101 + 1] + 1);


        }
        for (int j = 0; j < 3; j++) {
            for (int i = -100; i <= 100; i++) {
                if (i % 2 == 0)
                    map[i + 101] = Math.min(Math.min(map[i / 2 + 101] + 1, map[i + 101]),
                            Math.min(map[i + 101 - 1] + 1, map[i + 101 + 1] + 1));
                else
                    map[i + 101] =
                            Math.min(map[i + 101],
                                    Math.min(map[i + 101 - 1] + 1, map[i + 101 + 1] + 1));


            }

        }
        System.out.println(map[y + 101]);
        return;
    }


}