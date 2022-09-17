class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        
        // your code here
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return noOfWays(dp,n);
    }
     int noOfWays(int[] dp, int n){
          if(n<0) return 0;
        if(n==0) return 1;
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = (noOfWays(dp,n-1) + noOfWays(dp,n-2))%1000000007;
        return dp[n];
    }
}
