import java.util.Arrays;

class Solution {
    public static int coinChange(int[] coins, int amount) {
      //  if()
        int res = 0;
        Arrays.sort(coins);
        System.out.println(coins[2]);
        int length = coins.length;
        if(length==1)
            return -1;
        if(amount==0)
            return 0;

        int[] count = new int[amount + 1];
//        for(int i=1;i<amount;i++)
//        {
//            for(int j=0;j<length;j++)
//            {
//                map[i][j]=0;
//            }
//
//        }
        int k = 0;
        for (int i = 1; i <= amount; i++) {
            if (k < length && i == coins[k]) {


                k++;
                count[i] = 1;
            } else {

                int t = 0;
                int temp=Integer.MAX_VALUE;
                for( t=0;t<length;t++)
                if (t < length && i - coins[t] > 0&&count[i - coins[t]]!=-1) {
                   // = count[i - coins[t]] + 1;
                    temp = temp > (count[i - coins[t]] + 1) ? (count[i - coins[t]] + 1) : temp;

                }
                if(i==7323)
                    System.out.println(t+"  "+count[i]);
                if(temp!=Integer.MAX_VALUE)
                {
                    count[i] = temp;

                }
                else
                    count[i] = -1;
            }

        }

        return count[amount];

    }

    public static void main(String[] args) {
        int[] nums = {281,20,251,251};
        System.out.println(coinChange(nums, 281));
    }
}