// Hint: need to find how many times 5 inside the given number.
// Since 5 must present in order to have 0 in factorial multiplication

class Solution {
    public int trailingZeroes(int n) {
        if(n < 5)
        {
             return 0;
        }
        int sum = 0;
        while(n >= 5)
        {
            n = n/5;
            sum += n;
        }
        return sum;
    }
}

// TC: O(long n)
// TC: O(1)
