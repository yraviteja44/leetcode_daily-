class Solution {
    public int[] sortedSquares(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }
        Arrays.sort(arr);
        int[] res = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            res[i] = arr[i]*arr[i];
        }
        return res;
    }
}