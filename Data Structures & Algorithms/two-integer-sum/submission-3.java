class Solution {
    public int[] twoSum(int[] nums, int target) {
        int poz_i = 0;
        int beg_i = 0;
        int left = nums[0];
        int[] rez = new int[2];
        int right = nums.length;
        int found = 0;
        int end_i = right;

        for (int i = 1; beg_i < right - 1 && found == 0; i++) 
        {
            left = nums[beg_i];

            if (target == left + nums[i]) 
            {
                found = 1;
                end_i = i;
            } 
            else if (i == right - 1) 
            {
                beg_i++;
                i = beg_i;
            }
        }

        rez[0] = beg_i;
        rez[1] = end_i;

        return rez;
    }
}