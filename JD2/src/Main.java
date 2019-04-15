import java.util.Scanner;

public class Main {
    static int res = 0;
    //    static HashSet<String> hs = new HashSet<String>();
    static int max = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int red = in.nextInt();
        int green = in.nextInt();


        build(red, green, 1);

        System.out.println(res % 1000000007);
    }

    public static void build(int red, int green, int layer) {
        if (green < layer && red < layer) {

            if (layer > max) {
                max = layer;
                res = 1;

            } else if (layer == max)
                res++;


            return;
        }


        if (red >= layer) {
            red = red - layer;

            build(red, green, layer + 1);
            red = red + layer;

        }

        if (green >= layer) {
            green = green - layer;
            build(red, green, layer + 1);


        }

return;
    }


}