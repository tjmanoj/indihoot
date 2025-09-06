class Solution {
    public int countTriangles(int arr[]) {
        if(arr.length < 3) return 0;
        Arrays.sort(arr);
        int count = 0;
        
        for(int i=2; i<arr.length; i++)
        {
            int left = 0, right = i - 1;
            
            while(left < right)
            {
                if(arr[left] + arr[right] > arr[i])
                {
                    count += (right-left);
                    
                    right-=1;
                }
                else
                {
                    left+=1;
                }
            }
        }
        return count;
    }
}

// TC : O(n^2 log n)
// SC : O(1)
