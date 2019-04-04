class Solution {
    public static int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        int i=0,k=0;
        while(i<haystack.length())
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                int j=i;
                while (j<haystack.length()&&haystack.charAt(j)==needle.charAt(j-i))
                { System.out.println(haystack.charAt(j)+"   "+needle.charAt(j-i));
                    j++;
                    if(j-i==needle.length())
                        return i;
                    if(haystack.charAt(j)==needle.charAt(0))
                        k=j;
                }


                i=k;

            }

            i++;

        }
        return -1;

    }


   public static void main (String [] args){
        String a1="mississippi";
       String a2= "issip";
System.out.println(strStr(a1,a2));
   }
}