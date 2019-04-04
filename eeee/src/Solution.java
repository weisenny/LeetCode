import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        ArrayList<Integer> ai = new ArrayList<Integer>();


            String s1 = in.nextLine();
            String s2 = in.nextLine();
            String[] ss=s1.split(" ");
            for(int i=0;i<ss.length;i++)
            {
                ai.add(trans(ss[i]));
            }
          //  System.out.println();

            int d=trans(s2);

        int length = ai.size();

        System.out.println(ai);

            int k = 0;
            int t = 0;
            int[][] map = new int[ai.size()][ai.size()];
            for (int i = 0; i < length; i++)
                for (int j = i + 1; j < length; j++)

                {
                    if (Math.abs(ai.get(i) - ai.get(j)) <= d)
                        k++;
                    t++;
                }
        System.out.println(k);
        System.out.println(t);
            double dou=0.0;
        dou=k/(t+0.0000000);
        System.out.println(dou);
        }

    public static int  trans(String arg) {
        char [] cs=arg.toCharArray();
        int sum=0;
        for(int i=0;i<cs.length;i++)
        {
            sum=sum+(cs[i]-'0')*(int )Math.pow(10,cs.length-1-i);

        }
    return sum;

    }
    }
