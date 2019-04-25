import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        ArrayList<Integer> ai = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            visited[i] = false;
        }
        Arrays.sort(nums);
        generate(ai, li, nums, visited);
        return li;
    }

    public static void generate(ArrayList<Integer> ai, List<List<Integer>> li, int[] nums, boolean[] visited) {
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i] && visited[i])
                continue;
            else if (!visited[i]) {
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


}