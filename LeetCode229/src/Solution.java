import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        if(nums.length==0)
            return res;
        if(nums.length==1)
        {
            res.add(nums[0]);
            return res;

        }

        int maxa = nums[0];
        int maxb = nums[1];
        int na = 0;
        int nb = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxa)
                na++;
            else if (nums[i] == maxb)
                nb++;
            else if (na == 0) {
                maxa = nums[i];
                na = 1;
            } else if (nb == 0) {
                maxb = nums[i];
                nb = 1;
            } else
            {
                na--;
                nb--;
            }


        }
        na = 0;
         nb = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==maxa)
                na++;
            if(nums[i]==maxb)
                nb++;

        }
        if(na>nums.length/3)
            res.add(maxa);
        if(nb>nums.length/3&&maxa!=maxb)
            res.add(maxb);

        return res;
    }
}
//     1,2,1
//n=   1,0,1
//max= 1,1,1

//     1,2,2
//n=   1,0,1
//max= 1,1,2