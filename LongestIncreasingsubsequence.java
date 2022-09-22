class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0) return 0;
        int[] dp = new int[nums.length];
         int length = 1;
        dp[0]=1;
        for(int i = 1; i<nums.length;i++){
            int max=0;
            for(int j = 0; j<i; j++){
              if(nums[i]>nums[j]){
                   max = Math.max(max,dp[j]);
              }  
            }
            dp[i] = max+1;
            length = Math.max(length, dp[i]);
        }
        return length;
    }
}
