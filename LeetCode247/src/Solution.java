import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(topKFrequent(nums, 2));
    }

    public  static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> ai = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);


        }
        PriorityQueue<Map.Entry<Integer, Integer>> pi = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        int j = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (j < k)
                pi.add(entry);
            else {
                if (entry.getValue() > pi.peek().getValue()) {

                    pi.poll();
                    pi.add(entry);
                }
            }
            j++;
        }


        for (int i = 0; i < k; i++) {

            ai.add(pi.poll().getKey());
        }
        return ai;
    }
//    public static List<Integer> topKFrequent(int[] nums, int k) {
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        ArrayList<Integer> ai = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (hm.get(nums[i]) == null) {
//                hm.put(nums[i], 1);
//                //  ai.add(nums[i]);
//            } else
//                hm.replace(nums[i], hm.get(nums[i]) + 1);
//
//
//        }
//        PriorityQueue<Map.Entry<Integer, Integer>> pi = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                return o1.getValue() - o2.getValue();
//            }
//        });
//        int j = 0;
//        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
//            if (j < k)
//                pi.add(entry);
//            else
//            {
//                if(entry.getValue()>pi.peek().getValue())
//                {
//
//                    pi.poll();
//                    pi.add(entry);
//                }
//            }
//            j++;
//        }
//
//
//        for (int i = 0; i < k; i++) {
//
//            ai.add(pi.poll().getKey());
//        }
//        return ai;
//    }
}