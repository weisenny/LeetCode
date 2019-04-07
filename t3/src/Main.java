// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> d=new ArrayList<>();
        ArrayList<Integer> p=new ArrayList<>();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
         d.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++){
            p.add(sc.nextInt());
        }

        int pay=p.get(0);
        int ab=d.get(0);
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                    return d.get(o2)-d.get(o1);
            }
        });

        for(int i=1;i<n;i++)
        {
            pq.add(i);
            //System.out.println(pq);
            if(ab>=d.get(i))
                continue;
            else
            {

                payment(ab,pq,d,p,i);
            }

        }
        System.out.println(pay);

    }
    public static void payment (int ab,PriorityQueue<Integer> pq,ArrayList<Integer> d,ArrayList<Integer> p,int i){

        PriorityQueue<Integer> money=new PriorityQueue<>();
        PriorityQueue<Integer> newpq=new PriorityQueue<>(pq);

        if(d.get(newpq.peek())>d.get(i)-ab)
        {
            money.add(p.get(i));
            newpq.poll();
            i++;

        }
        else
        {
            int sum=0;
            int [] nums=newpq.toArray();
          for(int j=0;j<newpq.size();j++)
          {
              sum=sum+
          }

        }

    }


}