class Solution {
    public int sumOfSquares(int[] nums) {
        int l = nums.length;
        int res =0;
        for(int i=0;i<l;i++){
            int n =i+1;
            if(l%n==0){
                res +=nums[i]*nums[i];
            }
        }
        return res;
    }
}