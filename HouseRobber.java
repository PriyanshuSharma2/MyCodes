class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        int maxAmount = amount(nums,dp,nums.length-1);
        return maxAmount;
    }
    public static int amount(int[] nums, int[] dp, int i){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
       int rob = nums[i] + amount(nums,dp,i-2);
         int dontRob = amount(nums,dp,i-1);
        dp[i] = Math.max(rob,dontRob);
        return dp[i];
    }
}
