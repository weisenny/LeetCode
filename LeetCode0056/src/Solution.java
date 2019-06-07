class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return intervals;
        int max = 0;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[0].length; j++) {
                max = max > intervals[i][j] ? max : intervals[i][j];

            }
        }
        int[] have = new int[max + 1];
        for (int i = 0; i < max + 1; i++) {
            have[i] = 0;
        }
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] == intervals[i][1]) {
                if (have[intervals[i][0]] == 0)
                    have[intervals[i][0]] = 2;
            } else {
                for (int j = intervals[i][0]; j < intervals[i][1]; j++) {
                    have[j] = 1;

                }
                have[intervals[i][1]] = -1;

            }


        }
        int i = 0;
        int count = 0;
        while (i <= max) {
            if (have[i] == 1) {
                intervals[count][0] = i;
                while (i <= max && have[i] == 1)
                    i++;
                intervals[count][1] = i;
                count++;

            }
            if (have[i] == 2) {
                intervals[count][0] = i;
                intervals[count][1] = i;
                count++;
                i++;
            }
            while (i <= max && have[i] <= 0)
                i++;
        }
        System.out.println(count);
        int[][] res = new int[count][2];
        for (int j = 0; j < count; j++) {
            res[j][0] = intervals[j][0];
            res[j][1] = intervals[j][1];

        }
        return res;
    }
}