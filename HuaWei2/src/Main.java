//abc3(A)

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                ArrayList<Character> ar=new ArrayList<>();
                    i=process(s,ar,i);
                    for(int k=0;k<ar.size();k++)
                         st.push(ar.get(k));



            } else {
                st.push(s.charAt(i));
            }
            i++;

        }

        String res="";
        while(!st.isEmpty())
        {
           res=res+ st.pop();
        }
        System.out.println(res);
    }
    public static int process (String s, ArrayList<Character> ar,int i){
        ArrayList<Character> a=new ArrayList<>();
        ArrayList<Integer> ai=new ArrayList<>();

        while(s.charAt(i) <= '9' && s.charAt(i) >= '0')
        {
            ai.add(s.charAt(i)-'0');
            i++;
        }
        int num=aitoint(ai);

        i = i + 1;
        while (s.charAt(i) != ')') {
            if(s.charAt(i) <= '9' && s.charAt(i) >= '0')
            {
                i= process(s,a,i);


            }

            else
                a.add(s.charAt(i));
            i++;
        }
        for(int k=0;k<num;k++)
        { for(int t=0;t<a.size();t++)
            ar.add(a.get(t));
        }
        return i;
    }
    public static  int aitoint (ArrayList<Integer> ai){
        int res=0;
        for(int i=0;i<ai.size();i++)
        {
            res=res+(int ) Math.pow(10,ai.size()-1-i)*ai.get(i);
        }

    return res;
    }
}

