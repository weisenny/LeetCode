// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            int a = in.nextInt();
            String b = in.next();
        ArrayList<Integer> nums=new ArrayList<>();
           // int num=b;
          for(int i=0;i<a;i++)
          {
             // System.out.println(num);
              if(b.charAt(i)=='1')
             nums.add(1);
              else nums.add(0);
          //  System.out.println(nums[i]);
          }
          int i=0;
         while(i<nums.size()-1)
          {
              if(nums.get(i)!=nums.get(i+1))
              {
                  nums.remove(i);
                  nums.remove(i);
                //  i=i-2;
              }
              else
                 i++;
          }
          System.out.println(nums.size());

    }
}