class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        
        if(k>=arr.size()) {
        reverse(arr,0,arr.size()-1);
        return;
        }
        int left = 0;
        int right = 0;
        for(int i = 0;i<arr.size(); i+=k)
        {
            left = i;
            right = Math.min(i+k-1, arr.size()-1);
            reverse(arr,left,right);
        }
    }
    public static void reverse(ArrayList<Integer> arr, int left, int right)
    {
        int temp = 0;
        
        while(left<right)
        {
            temp = arr.get(left);
            arr.set(left,arr.get(right));
            arr.set(right,temp);
            left++;
            right--;
        }
    }
}
