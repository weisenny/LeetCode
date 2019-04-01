import java.util.*;

class Solution {
    public static int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int  min =num[0] + num[1] + num[2] - target;
       // System.out.println( min);
        // List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length - 2; i++) {
           // System.out.println( i);
            if (i == 0 || (i > 0 && num[i] != num[i - 1])) {
                int lo = i + 1, hi = num.length - 1;
                while (lo < hi) {

//                    System.out.println( hi);
//                    System.out.println( i);
//                    System.out.println( "end");
                    int t = num[lo] + num[hi] + num[i] - target;
                    System.out.println( num[lo] +" "+ num[hi] +" "+  num[i]);
                    if (t > 0)
                    {
                        if (Math.abs(t) < Math.abs(min))
                            min=t;
                        hi--;

                    }



                    else
                    {
                        if (Math.abs(t) < Math.abs(min))
                            min=t;
                        lo++;

                    }

                    System.out.println( min);

                }
            }
        }
        return min+target;
    }
    public static void  main(String args[])
    {
        int [] nums={82,-16,-60,-48,32,-30,0,-89,70,-46,-82,-58,66,41,-96,-55,-49,-87,-33,-65,9,14,81,-11,80,-93,79,-63,-61,-16,22,-31,75,12,17,-6,37,-2,-89,-66,3,-95,-74,58,-95,22,11,-20,-36,60,-75,46,-52,-61,-28,7,-50,-45,93,-91,-43,35,-99,-39,53,-54,-98,-4,13,-90,23,-4,-65,29,85,-76,-64,81,32,-97,51,12,-82,-31,81,-2,-83,-9,89,-37,-23,-66,-91,-15,-98,-74,94,30,-2,-70,13,19,-77,-42,33,-70,25,77,47,-70,-70,60,-63,-4,83,13,-78,-23,28,-86,-11,-16,-57,-84,51,-48,-63,-15,29,56,-25,73,-69,23,28,90,96,41,65,-22,-43,-68,-77,31,69,-84,23,-63,-18,20,-93,-17,-48,-73,14,-95,98,-64,-12,-45,14,7,51,-61,89,-48,-23,2,-56,84,-2,27,74,-39,-18,-65,79,-36,-76,-30,44,78,-76,37,88,0,32,55,-51,23,-9,68,26,15,66,66,-56,-42,56,28,33,-32,-23,-36,-12,-76,-12,42,12,40,69,54,82,-22,-7,46,-46};

        System.out.println( threeSumClosest(nums,270));
    }
}