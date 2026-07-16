class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean found = false;
        int n =  nums.length;
        int i=1;
        while (n!=0 && i<nums.length)
        {
            if( nums[i-1]==nums[i])
            {
                found = true;
                break;
            }
            else i++;
        }
        return found;
    }
}