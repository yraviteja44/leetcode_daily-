class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] res = new int[arr.length];
        int j =0;
        int k =1;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]>0){
                res[j] = arr[i];
                j+=2;
            }else{
                res[k] =arr[i];
                k+=2;
            }
        }
        return res;
    }
}