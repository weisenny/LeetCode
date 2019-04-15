import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class pig {
    int id;
    int year;
    int num;
    int age;

    pig(int i,int y, int n, int a) {
        id=i;
        year = y;
        num = n;
        age = a;
    }
}

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /**
     * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^
     **/
    static String calculate(int m, int k) {
        ArrayList<pig> ap = new ArrayList<>();

        ap.add(new pig(0,0, 2, 0));
        ap.add(new pig(1,1, 2, 1));
        ap.add(new pig(2,1, 3, 3));
        int year = 1;
        boolean flag = true;
        int n = 2;
        while (flag) {
            year++;

            int tempsize = ap.size();
            for (int i = 1; i < tempsize; i++) {
                ap.get(i).age++;
                if (ap.get(i).age >=3) {
                    n++;
                    ap.add(new pig(n,year, ap.get(n - 2).num + ap.get(n - 3).num, 1));
                    if (n== m) {
                        flag = false;
                        break;
                    }

                }

            }
            if (flag == false)
                break;
        }
        PriorityQueue<pig> pi=new PriorityQueue<pig>(new Comparator<pig>() {
            @Override
            public int compare(pig o1, pig o2) {
                return reverse(o2.num)-reverse(o1.num);
            }
        });
        for (int i = 1; i < ap.size(); i++) {
            System.out.println(ap.get(i).id+"  "+(2018+ap.get(i).year)+"  "+ap.get(i).num+"  "+ap.get(i).age);
         pi.add(ap.get(i));

        }
        pig kn=pi.peek();
        for(int i=0;i<k;i++)
            kn=pi.poll();


        StringBuilder sb=new StringBuilder();
        sb.append(ap.get(ap.size()-1).num);
        sb.append(',');
        sb.append(2018+ap.get(ap.size()-1).year);
        sb.append(',');
        sb.append(kn.id);

        return sb.toString();


    }
    public static int reverse (int nums){
        int sum=0;
        while(nums>10)
        {
            sum=sum*10+nums%10;
            nums=nums/10;
        }
        sum=sum*10+nums%10;
        return sum;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(",");
        int m = Integer.valueOf(line[0]);
        int k = Integer.valueOf(line[1]);
        ;
        System.out.println(calculate(m, k));

    }
}