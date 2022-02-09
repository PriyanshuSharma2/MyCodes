class Solution
{
    static int isPossible(int N, int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        if(sum%3==0)
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }
}
