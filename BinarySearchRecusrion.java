class Solution {
    public static int binarySearch(int[] arr, int low, int high, int key){
        
        if(low>high) return -1;
        
        int mid = (low+high)/2;
        if(arr[mid] == key) return mid;
        if(arr[mid]>key) return binarySearch(arr, low, mid-1, key);
        else  return binarySearch(arr, mid+1, high, key);
        
    }
    int binarysearch(int arr[], int n, int k) {
        // code her
        return binarySearch(arr,0,n-1,k);
    }
}
