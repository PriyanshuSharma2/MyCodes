
class Solution{
    
    int Maximize(int arr[], int n)
    {
        // Complete the function
        Arrays.sort(arr);
        int mod = (int)1e9+7;
        long sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+= (long)arr[i]*i;
        }
        sum = sum%mod;
        return (int)sum;
    }   
}

