import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int length=s.length();
        int max=0;
        if(s.charAt(0)==s.charAt(length-1))
            max=test(s);
        int temp=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='1')
                temp++;
            else
            {
                if(temp>max)
                    max=temp;
                temp=0;
            }



        }




        System.out.println(max);
        return;
    }
    public static int test (String s){
        int former=0;
        int laster=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='1')
                former++;
            else break;


        }
        if(former==s.length())
            return former;
        for (int i=s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)=='1')
                laster++;
            else break;


        }
        return former+laster;

    }


}