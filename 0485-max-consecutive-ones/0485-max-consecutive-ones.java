class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int m = 0;
        int mm =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==1){
                m++;
            }
            else{
                
                m=0;
            }
            if(m>mm){
                mm=m;
            }

        }
        return mm;


        
    }
}