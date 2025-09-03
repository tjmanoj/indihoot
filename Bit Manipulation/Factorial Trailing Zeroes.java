// Hint: need to find how many times 5 inside the given number.
// Since 5 x 2 will give a trailing zero. For example 15x14x13x12x11x10x9x8x7x6x5x4x3x2x1 (Here from 1 every 5th position has a 5 in multiples)
// So if we find how many 5's thats the result.
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
