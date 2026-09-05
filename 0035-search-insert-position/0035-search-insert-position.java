class Solution {
    public int searchInsert(int[] arr, int target) {
        int l = 0;
        int h = arr.length-1;
        
        
        while(l<=h){
            int mid = (l+h)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target <arr[mid]){
                h= mid-1;
                //res =mid-1;
            }else{
                l =mid+1;
                //res=mid+1;
            }

        }

        return l;
    }
}