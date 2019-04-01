import  java.util.*;
class Solution {
    public static List<List<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);

        List<List<Integer>> res = new LinkedList<>();
       for(int j=0;j<num.length-3;j++){
           if(j==0||j>0&&num[j] != num[j-1])
           for (int i = j+1; i < num.length-2; i++) {
               if (i ==j+1 || (i > j+1 && num[i] != num[i-1])) {
                   int lo = i+1, hi = num.length-1, sum = target - num[i]-num[j];
                   while (lo < hi) {
                       if (num[lo] + num[hi] == sum) {

                         //  if(!res.contains(Arrays.asList(num[j],num[i], num[lo], num[hi])))
                           res.add(Arrays.asList(num[j],num[i], num[lo], num[hi]));
                           while (lo < hi && num[lo] == num[lo+1]) lo++;
                           while (lo < hi && num[hi] == num[hi-1]) hi--;
                           lo++; hi--;
                       } else if (num[lo] + num[hi] < sum) lo++;
                       else hi--;
                  }
               }
           }
       }
        return res;


       }

    public static void main(String [] args){
        int []ns={-1,-5,-5,-3,2,5,0,4};
        System.out.println(fourSum(ns,-7));


    }
}
