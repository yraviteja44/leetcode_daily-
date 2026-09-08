class Solution {
    public void moveZeroes(int[] arr) {
        int size = arr.length;
        if(size==0||size==1){
            return;
        }
        int i =0;
        int j =0;
        while(j<arr.length){
            if(arr[j]!=0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
                i++;  
            }else{
                j++;
            }
            
        }
    }
}