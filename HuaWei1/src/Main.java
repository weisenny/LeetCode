// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> as=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String ss=sc.next();
            int length=ss.length();
            while(length>8)
            {
                as.add(ss.substring(0,8));
                ss=ss.substring(8);
                length=length-8;
            }

            as.add(ss);

        }
        for(int i=0;i<as.size();i++)
        {
            while(as.get(i).length()<8)
            {
              as.set(i,as.get(i)+'0');
            }
        }
        as.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==0)
                    return 0;

                if(o1.charAt(0)!=o2.charAt(0))
                    return o1.charAt(0)-o2.charAt(0);
                else
                   return compare(o1.substring(1),o2.substring(1)) ;
            }
        });



        for(int i=0;i<as.size();i++)
        {
            System.out.print(as.get(i));
        }

    }

}