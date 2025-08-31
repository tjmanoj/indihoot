class Solution {
    public int minMoves2(int[] nums) {
        int moves = 0;
        if(nums.length == 1) return 0;

        Arrays.sort(nums);

        int middle = nums.length / 2;
        int median;
        if((nums.length & 1) == 1)
        {
            median = nums[middle];
        }
        else
        {
            median = (nums[middle] + nums[middle - 1]) /2;
        }

        for(int num : nums)
        {
            if(num < median)
            {
                moves += (median - num);
            }
            if(num > median)
            {
                moves += (num - median);
            }
        }
        return moves;
    }
}
