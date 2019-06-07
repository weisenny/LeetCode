//Given a set of distinct integers, nums, return all possible subsets (the power set). 
//
// Note: The solution set must not contain duplicate subsets. 
//
// Example: 
//
// 
//Input: nums = [1,2,3]
//Output:
//[
//  [3],
//  [1],
//  [2],
//  [1,2,3],
//  [1,3],
//  [2,3],
//  [1,2],
//  []
//] 
//

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> li;
    List<List<Integer>> lli;

    public List<List<Integer>> subsets(int[] nums) {
        lli = new ArrayList<>();
        li = new ArrayList<>();
        generate(nums, 0, li);
        return lli;

    }

    public void generate(int[] nums, int i, List<Integer> li) {
        if (i == nums.length - 1)
        {
            lli.add(new ArrayList<Integer>(li));
            return;
        }

        li.add(nums[i]);
        generate(nums, i + 1, li);
        li.remove(li.size() - 1);
        generate(nums, i + 1, li);


    }
}