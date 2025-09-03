class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        while((n & 1) == 0)
        {
            n = n/2;
        }
        return n == 1;
    }
}

// Time Complexity: O(log n)
// Space Complexity: O(1)
