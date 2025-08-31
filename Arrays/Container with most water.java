class Solution {
    public int maxArea(int[] height) {
        int max_capacity = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right)
        {
            int start_line = height[left];
            int end_line = height[right];
            int breadth = Math.min(start_line,end_line);
            int length = right - left;
            int capacity = length * breadth;

            if(capacity > max_capacity)
            {
                max_capacity = capacity;
            }

            if(start_line <= end_line)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max_capacity;
    }
}
