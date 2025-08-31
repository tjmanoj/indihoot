class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums;
        int left = 0;
        int right = 1;
        while(right < n && (nums[left] & 1) == 0)
        {
            left++;
            right++;
        }

        while(right < n)
        {
            if((nums[right] & 1) == 0)
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
        return nums;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
