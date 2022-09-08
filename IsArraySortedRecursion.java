class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        if(n == 0 || n==1) return true;
        if(arr[n-1]<arr[n-2]) return false;
        else return arraySortedOrNot(arr,n-1); 
        
    }
}
