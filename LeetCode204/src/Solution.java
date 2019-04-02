import java.util.ArrayList;

class Solution {
    public static int countPrimes(int n) {
        ArrayList<Integer> ai = new ArrayList<Integer>();
        int count = 0;
        for (int i = 2; i < n; i++) {
            int flag = 1;
            int j = 0;
            while (j < count && ai.get(j) <= (int) Math.pow(i, 0.5)) {
                if (i % ai.get(j) == 0) {
                    flag = 0;
                    break;
                }
                j++;

            }

            if (flag == 1) {
                ai.add(i);
                count++;

            }


        }
        return ai.size();

    }

//筛法

//        public int countPrimes(int n) {
//            boolean[] notPrime = new boolean[n];
//            int count = 0;
//            for (int i = 2; i < n; i++) {
//                if (notPrime[i] == false) {
//                    count++;
//                    for (int j = 2; i*j < n; j++) {
//                        notPrime[i*j] = true;
//                    }
//                }
//            }
//
//            return count;
//        }


    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}