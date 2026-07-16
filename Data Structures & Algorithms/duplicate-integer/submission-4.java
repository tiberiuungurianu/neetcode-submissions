class Solution {
    public boolean hasDuplicate(int[] nums) {
       

       HashSet <Integer> apparitions = new HashSet<>();

       for (int i = 0 ; i< nums.length; i++)
       {
        if ( apparitions.contains(nums[i]))
        {
            return true;
        }
        apparitions.add(nums[i]);
       }
        return false;
    }
}