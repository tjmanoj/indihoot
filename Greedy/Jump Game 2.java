class Solution {
    public int jump(int[] nums) {
        int steps = 0;
        int left = 0, right = 0;

        while(right < nums.length -1)
        {
            int farthestJump = 0;
            for(int i=left; i < right+1; i++)
            {
                farthestJump = Math.max(farthestJump, i + nums[i]);
            }
            left = right + 1;
            right = farthestJump;
            steps++;
        }
        return steps;
    }
}

// TC : O(N)
// SC : O(1)
