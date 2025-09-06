class Solution {
    public boolean canJump(int[] nums) {
        int ind = nums.length - 1;       // first setting index = last index (n-1)th
                                        // then start checking from (n-2)th index
        for(int i=ind-1; i >= 0; i--)
        {
            if((nums[i] + i) >= ind)
            {
                ind = i;
            }
        }
        return ind == 0;    // check if the index reached the beginning from end
    }
}

// TC : O(N)
// SC : O(1)
