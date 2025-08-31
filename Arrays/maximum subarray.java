class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int num: nums)
        {
            sum += num;
            if(sum >= max)
            {
                max = sum;
            }
            if(sum < 0)
            {
                sum = 0;
            }
        }
        return max;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
