class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean found = false;
        for ( int i = 1 ; i< nums.length ;)
        {
            if( nums[i-1]==nums[i])
            {
                found = true;
            }
            else i++;
        }
        return found;
    }
}