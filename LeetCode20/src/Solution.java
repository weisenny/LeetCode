import java.util.*;
class Solution {
    public static boolean isValid(String s) {
        ArrayList<Character> former= new ArrayList<>();
       former.add('{');
        former.add('[');
        former.add('(');
        ArrayList<Character> last= new ArrayList<>();
        last.add('}');
        last.add(']');
        last.add(')');




        Stack<Character>  sc=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(former.contains(s.charAt(i)))
            {
                sc.push(s.charAt(i));
            }
            else
                if(!sc.empty()&&last.contains(s.charAt(i)))
                {

                    char c=sc.pop();
                    if(eq(c,s.charAt(i)))
                        continue;
                    else
                        return false;
                }
                else
                    return false;

        }
            if(sc.empty())
                return true;
        else
                return false;

    }
    public static boolean eq (char a,char b){
        if((a=='{'&&b=='}')||(a=='['&&b==']')||(a=='('&&b==')'))
            return true;
        return false;


    }
    public static void main (String [] args){
        String s="]";
           System.out.println( isValid(s));
    }
}