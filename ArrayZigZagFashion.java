class Solution {
    void zigZag(int arr[], int n) {
        // code here
        for(int i = 0;i<arr.length-1;i++)
        {
            if(i%2==0 && arr[i]>arr[i+1])
            {
                int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
            }
            else{
                if(i%2==1 && arr[i]<arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

}
