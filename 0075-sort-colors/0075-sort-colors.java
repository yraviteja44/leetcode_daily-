class Solution {
    public void sortColors(int[] arr) {
        int l = 0;                  // Boundary for 0s
        int r = arr.length - 1;     // Boundary for 2s
        int i = 0;                  // Current element pointer

        while (i <= r) {
            if (arr[i] == 0) {
                // Swap arr[i] with arr[l]
                int temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                l++;
                i++; // Safe to move i forward because arr[l] was already processed
            } else if (arr[i] == 2) {
                // Swap arr[i] with arr[r]
                int temp = arr[i];
                arr[i] = arr[r];
                arr[r] = temp;
                r--;
                // Do NOT increment i here, as the new arr[i] needs to be checked
            } else {
                // arr[i] == 1
                i++;
            }
        }
    }
}