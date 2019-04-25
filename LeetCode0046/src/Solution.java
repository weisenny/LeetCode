import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();

        boolean[] visited = new boolean[nums.length];
        ArrayList<Integer> ai = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            visited[i] = false;
        }
        generate(ai, li, nums, visited);
        return li;
    }

    public static void generate(ArrayList<Integer> ai, List<List<Integer>> li, int[] nums, boolean[] visited) {
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                ai.add(nums[i]);
                visited[i] = true;
                if (ai.size() == nums.length)
                    li.add(new ArrayList<Integer>(ai));
                else
                    generate(ai, li, nums, visited);
                ai.remove(ai.size() - 1);
                visited[i] = false;
            }

        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }
}
//  public static void generate(ArrayList<Integer> ai, ArrayList<Integer> res, List<List<Integer>> li) {
//        if (ai.size() == 1) {
//            ArrayList<Integer> newai = new ArrayList<>(res);
//            newai.add(ai.get(0));
//            li.add(newai);
//            return;
//        }
//        for (int i = 0; i < ai.size(); i++) {
//            ArrayList<Integer> newai = new ArrayList<>(ai);
//            ArrayList<Integer> newres = new ArrayList<>(res);
//            newres.add(newai.get(i));
//            newai.remove(i);
//            generate(newai, newres, li);
//
//
//        }
//    }
//
//    public static List<List<Integer>> permute(int[] nums) {
//        ArrayList<Integer> ai = new ArrayList<>();
//        ArrayList<Integer> res = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            ai.add(nums[i]);
//
//        }
//
//        List<List<Integer>> li = new ArrayList<>();
//        generate(ai, res, li);
//
//        return li;
//    }
