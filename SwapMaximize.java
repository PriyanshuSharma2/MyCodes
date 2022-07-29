class GFG
{
    long maxSum(long arr[] ,int n)
    {
         Arrays.sort(arr);
         int i = 0;
         int j = n-1;
         long sum = 0;
         
         while(i<j){
             sum+= (long)Math.abs(arr[i]-arr[j]);
             sum+=(long)Math.abs(arr[j]-arr[i+1]);
             j--;
             i++;
         }
         sum+= (long)arr[i]-arr[0];
         return sum;
    }
}
