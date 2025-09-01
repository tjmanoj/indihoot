class Solution {
    public int minNumberOperations(int[] target) {
        int prev = 0;
        int incrementsCount = 0;

        for(int curNum : target)
        {
            if(curNum > prev)
            {
                incrementsCount += (curNum - prev);
            }
            prev = curNum;
        }
        return incrementsCount;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
