class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        int l =0;
        
        long max =0;
        long mmax=0;
        HashSet<Integer> set = new HashSet<>();
        for(int r=0;r<arr.length;r++){
            while(set.contains(arr[r])){
                set.remove(arr[l]);
                
                max -=arr[l];
                l++;
            }
            set.add(arr[r]);

            max+=arr[r];
            if(r-l+1==k){
                if(max>mmax){
                    mmax =max;
                }
                set.remove(arr[l]);
                max -=arr[l];
                l++;

            }

        }
        return mmax;
        
    }
}