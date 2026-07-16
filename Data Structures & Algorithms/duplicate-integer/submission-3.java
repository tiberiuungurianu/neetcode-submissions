class Solution {
    public boolean hasDuplicate(int[] nums) {
        // boolean found = false;
        // int n =  nums.length;
        // int i=1;
        // while (n!=0 && i<nums.length)
        // {
        //     if( nums[i-1]==nums[i])
        //     {
        //         found = true;
        //         break;
        //     }
        //     else i++;
        // }
        // return found;

        int [] apparitions = new int [nums.length+1];
        int i = 1;
        int found = 0;
        apparitions[0]=1;
        while( found == 0 && i<nums.length)
        {
            if( nums[i-1] == nums[i] && apparitions[nums[i]] == 1 )
            {
                 found = 1;
            }
            else
            {
                apparitions[nums[i]] = 1;
            }
            i++;
        }
        if( found == 1 )
        return true;
        else return false;
    }
}