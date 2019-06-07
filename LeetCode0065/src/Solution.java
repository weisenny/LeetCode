class Solution {
    //static
    public static void main (String [] args){

    System.out.println(isNumber(" ."));
    }


    public static boolean isNumber(String s) {
        int i=0;
        int start=0;
        if(i==s.length())
            return false;
        while (i<s.length()&&s.charAt(i)==' ')
            i++;
        if(i==s.length())
            return false;
        if(s.charAt(i)=='+'||s.charAt(i)=='-')
            i++;
        if(i==s.length())
            return false;


        if((s.charAt(i)>'9'||s.charAt(i)<'0')&&s.charAt(i)!='.')
            return false;
        start=i;
        i= processnum(s,i);
        if(i==s.length())
            return true;
        if(s.charAt(i)=='.')
        {
            i++;
            if(i== processnum(s,i))
            if(i-2<start||(i-2>=start&&(s.charAt(i-2)>'9'&&s.charAt(i-2)<'0')))
            {
               System.out.println("o");
                return false;
            }

            //System.out.println(i);
            i=processnum(s,i);
            if(i==s.length())
                return true;
        }


        if(s.charAt(i)=='e')
        {
            i++;
            if(s.charAt(i)=='+'||s.charAt(i)=='-')
                i++;
            if(i== processnum(s,i))
                return false;
            i= processnum(s,i);
            if(i==s.length())
                return true;
        }
        while (i<s.length()&&s.charAt(i)==' ')
            i++;
        if(i==s.length())
            return true;

        return false;


    }
    public static  int   processnum(String s,int i){
        while(i<s.length()&&(s.charAt(i)<='9'&&s.charAt(i)>='0'))
            i++;
        return i;
    }


}