import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        ArrayList<Integer> ai = new ArrayList<>();
        find(ll,ai, candidates, target, candidates.length - 1);
        return ll;


    }

    public static void find(List<List<Integer>> ll,ArrayList<Integer> ai, int[] candidates, int target, int max) {

        for (int i = max; i >= 0; i--) {
            if (candidates[i] == target) {
                ArrayList<Integer> newai = new ArrayList<>(ai);
                newai.add(candidates[i]);
                ll.add(newai);
            } else if (candidates[i] < target) {
                ArrayList<Integer> newai = new ArrayList<>(ai);
                newai.add(candidates[i]);
                find(ll,newai, candidates, target - candidates[i], i);

            }



        }

    }

    public static void main(String[] args) {
        int[] can = {10,1,2,7,6,1,5};
        System.out.println(combinationSum(can,8));

    }
}