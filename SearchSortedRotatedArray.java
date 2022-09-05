class Solution 
{ 
    static int Search(int array[], int target)
	{
	    // code here
	    int mid = 0;
	    int l = 0;
	    int h = array.length-1;
        while(l<=h){
            mid = (h+l)/2;
            if(array[mid] == target) return mid;
            if(array[l]<=array[mid]){
                if(array[l]<=target && array[mid]>=target){
                    h = mid-1;
                }
                else{
                    l= mid+1;
                }
            }
            else{
                 if(array[mid]<=target && array[h]>=target){
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
