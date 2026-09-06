class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        
        while (l < r) {
            int mid = l + (r - l) / 2;
            
            if (nums[mid] < nums[mid + 1]) {
                l = mid + 1; // Peak is on the right side
            } else {
                r = mid;     // Peak is at mid or on the left side
            }
        }
        
        return r; // l == r, pointing to a peak element
    }
}