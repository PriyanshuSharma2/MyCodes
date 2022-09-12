class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        if(arr.length == 1 || arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(low<=high){
            mid = low + (high-low)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) return arr[mid];
            if((mid%2==0 && arr[mid]==arr[mid+1]) || (mid%2==1 && arr[mid]==arr[mid-1])) low = mid+1;
            else high = mid-1;
        }
        return -1;
   }
}
