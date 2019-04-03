import java.util.*;
class Solution {

    public static List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder();
        List<String>  ls=new ArrayList<String>();
        generate(ls,sb,n,n+n,0);
        return ls;
    }
    public static void generate( List<String> ls,StringBuilder sb,int bar,int n,int s)
    {



        if(n==0)
        {
           ls.add(sb.toString()) ;
           return;
        }


        if(bar>0)
        {
            StringBuilder sbtem=new StringBuilder(sb);
            sbtem.append('(');
            generate(ls,sbtem,bar-1,n-1,s+1);


        }

        if(s>0)
        {
            StringBuilder sbtem=new StringBuilder(sb);
            sbtem.append(')');
            generate(ls,sbtem,bar,n-1,s-1);

        }



    }

    public static void main (String [] args){
        System.out.println(generateParenthesis(4));
    }
}