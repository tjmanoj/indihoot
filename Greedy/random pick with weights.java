class Solution {
    Random random = new Random();
    int[] ranges;
    
    public Solution(int[] w) {
        ranges = new int[w.length];

        ranges[0] = w[0];
        for(int i=1;i<w.length;i++)
        {
            ranges[i] = ranges[i-1] + w[i];
        }
    }
    
    public int pickIndex() {
        int rand = random.nextInt(ranges[ranges.length-1]) + 1;
        int low = 0, high = ranges.length-1;
        int res = 0;
        while(low <= high)
        {
            int mid = (low + high) /2;
            if(ranges[mid] > rand)
            {
                res = mid;
                high = mid-1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return res;
    }
}

// Preprocessing (constructor):

// Time: O(n)
// Space: O(n)

// Query (pickIndex):

// Time: O(log n)
// Space: O(1)
