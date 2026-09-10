class Solution {
    public int trap(int[] arr) {
        int[] lb = new int[arr.length];
        int[] rb = new int[arr.length];
        lb[0]= arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>lb[i-1]){
                lb[i] = arr[i];
            }
            else{
                lb[i] = lb[i-1];
            }
        }
        rb[arr.length-1] =arr[arr.length-1];
        for(int i= arr.length-2;i>=0;i--){
            if(arr[i]>rb[i+1]){
                rb[i] = arr[i];
            }else{
                rb[i] = rb[i+1];
            }
        }
        int res =0;
        for(int i = 1 ;i<arr.length-1;i++){
            int x = Math.min(lb[i],rb[i]);
            res += x - arr[i];
        }
        
        return res;




    }
}