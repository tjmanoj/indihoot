class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int prefixSum = 0;
        hashMap.put(prefixSum,0);

        for(int i=0; i< nums.length; i++)
        {
            int curNum = nums[i];
            prefixSum = (prefixSum + curNum) % k;

            if(hashMap.get(prefixSum) != null)
            {
                int index = hashMap.get(prefixSum);
                if(i+1 - index >= 2) return true;
            }
            else
            {
                hashMap.put(prefixSum, i+1);
            }
        }
        return false;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(min(n, k))
