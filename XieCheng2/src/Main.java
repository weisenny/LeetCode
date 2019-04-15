import java.util.Scanner;

class node {
    String var;
    node next;

    node(String v) {
        this.var = v;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String olds = in.nextLine();
        String s = olds.substring(1, olds.length() - 1);
        String[] ss = s.split(",");
        int k = in.nextInt();


        if (ss.length < k) {
            System.out.println(olds);
            return;
        }

        int begin = 0;
        while (begin +k<=ss.length) {
            reverse(ss, begin, begin + k - 1);
            begin = begin + k;
        }
        System.out.print("[");
        System.out.print(ss[0]);

        for (int i = 1; i < ss.length; i++)

        {System.out.print(",");
            System.out.print(ss[i]);
        }

        System.out.print("]");
    }

    public static void reverse(String[] ss, int begin, int end) {
//System.out.println(begin+" be "+end);
        for (int i = 0; i <(end - begin + 1) / 2; i++) {
            //System.out.println(ss[begin+i]+"  "+ss[end - i]);
            String temp = new String(ss[begin+i]);
            ss[begin+i] = new String (ss[end - i]);
            ss[end - i] =new String(temp);
          //  System.out.println(ss[begin+i]+" end "+ss[end - i]);
        }

    }

}