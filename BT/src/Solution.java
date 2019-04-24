public class Solution {
    //xxx a
//xxx b


        public static void main(String [] args)
        {
            String s1="ACDE";
            String s2="ACD";
            System.out.println(editcost(s1,s2));

        }

        static int editcost(String s1,String s2)
        {
            int [][]costmap=new int [s1.length()+1][s2.length()+1];
            //insert
            //delete
            //modeify
            for(int i=0;i<s1.length()+1;i++)
                costmap[i][0]=i;
            for(int i=0;i<s2.length()+1;i++)
                costmap[0][i]=i;

            for(int i=1;i<s1.length()+1;i++)
                for(int j=1;j<s2.length()+1;j++)
                    if(s1.charAt(i-1)!=s2.charAt(j-1))
                    {
                        costmap[i][j]=Math.min( costmap[i-1][j-1]+3 ,//modefiy
                                Math.min(costmap[i-1][j]+2,
                                        costmap[i][j-1]+2));
                    }
                    else
                       costmap[i][j] = costmap[i-1][j-1];
            return costmap[s1.length()][s2.length()];
        }

    }

