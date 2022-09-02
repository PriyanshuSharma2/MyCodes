class Solution
{
    int search(int A[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        int mid = 0;
        while(l<=h){
            mid = (h+l)/2;
            if(A[mid] == key) return mid;
            if(A[l]<=A[mid]){
                if(A[l]<=key && A[mid]>=key){
                    h = mid-1;
                }
                else{
                    l= mid+1;
                }
            }
            else{
                 if(A[mid]<=key && A[h]>=key){
                    l = mid+1;
                }
                else{
                    h= mid-1;
                }
            }
        }
        return -1;
    }
}
