import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {


    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);

        ArrayList<Integer> ai = new ArrayList<>();
        int length = candidates.length - 1;
        while (length>0&&candidates[length] > target)
            length--;
        if(length==-1)
            return ll;
        System.out.println(length);
        find(ll, ai, candidates, target, length, 0);
        return ll;


    }

    public static void find(List<List<Integer>> ll, ArrayList<Integer> ai, int[] candidates, int target, int max, int now) {
        int temp = -1;
        for (int i = max; i >= 0; i--) {
            if (candidates[i] == temp)
                continue;
            else {
                temp = candidates[i];
                if (candidates[i] + now == target) {
                    ArrayList<Integer> newai = new ArrayList<>(ai);
                    newai.add(candidates[i]);
                    ll.add(newai);
                } else if (candidates[i] + now < target) {
                    ArrayList<Integer> newai = new ArrayList<>(ai);
                    newai.add(candidates[i]);
                    find(ll, newai, candidates, target, i - 1, now + candidates[i]);

                }

            }
        }

    }

    public static void main(String[] args) {
        int[] can = {2};
        System.out.println(combinationSum2(can, 1));

    }

}