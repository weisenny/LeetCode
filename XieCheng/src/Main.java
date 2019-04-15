// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int ans = 0, x;
        String olds=sc.nextLine();
        String [] ss=olds.split(" ");
        System.out.println(olds);
        ArrayList<String > same=new ArrayList<>();
        ArrayList<String > sts=new ArrayList<>();

        for(int i = 1; i < ss.length; i++){
            System.out.println(ss[i]);
            if(!ss[i].equals(" "))
            {
                String temp=count(same,ss[i],i);
                sts.add(temp);
            }
        }
        System.out.println(sts);
    }
    public static String count (ArrayList<String> same, String s,int cishu){
      //  System.out.println(s);
        StringBuilder sb=new StringBuilder();
        String [] ss=s.split("/");
        if(ss.length==1)
            return "1";
int cou=0;
        for (int i=1;i<ss.length;i++) {
            if (i - 1 <= same.size()) {
                if (!ss[i].equals(" "))
                    if (ss[i].equals(same.get(i - 1))) {
                        sb.append(cishu);
                        sb.append(' ');

                    } else
                        return "-1";


            }
            else same.add(ss[i]);
        }

        String res=sb.toString();
       res= res.substring(1,res.length()-2);
       res="1"+res+"1";


      return res;

    }
}