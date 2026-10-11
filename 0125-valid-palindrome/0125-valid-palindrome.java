class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
       
        int  l=0;
        int r = s.length()-1;
        char [] arr = s.toCharArray();
        while(l<r){
            if(arr[l]==arr[r]){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}