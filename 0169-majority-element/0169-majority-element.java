class Solution {
    public int majorityElement(int[] nums) {
        int m = nums[0];
        int c = 1;
        for(int i =0;i<nums.length;i++){
            if(m == nums[i]){
                c++;
            }else{
                c--;
            }
            if(c==0){
                m=nums[i];
                c=1;
            }

        }
        return m;
        
    }
}