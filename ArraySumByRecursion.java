
class Get
{
    public static int sumElement(int arr[], int n)
    {
        // Your code here
        
        if(n==0) return 0;
        if(n==1) return arr[0];
        
        return arr[n-1]+sumElement(arr,n-1);
    }
}
