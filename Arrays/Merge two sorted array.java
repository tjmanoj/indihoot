class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int ind = m+n-1;

        while(ind >= 0)
        {
            if(i < 0)
            {
                nums1[ind] = nums2[j--];
            }
            else if(j < 0)
            {
                break;
            }

            else if(nums1[i] > nums2[j])
            {
                nums1[ind] = nums1[i--];
            }
            else
            {
                nums1[ind] = nums2[j--];
            }
            ind--;
        }
    }
}

// Time Complexity : O(m + n)
// Space Complexity: O(1)
