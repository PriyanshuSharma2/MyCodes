class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] wrd1 = text1.toCharArray();
        char[] wrd2 = text2.toCharArray();
        int dp[][] = new int[wrd1.length + 1][wrd2.length + 1];
        int max = 0;
        for(int i=1; i <=wrd1.length; i++) {
            for(int j=1; j<=wrd2.length; j++) {
                if(wrd1[i-1] == wrd2[j-1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                
                else
                {
                  dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);  
                }
                
                if(dp[i][j] > max) {
                    max = dp[i][j];
                    
                }
            }
        }
        
        return dp[wrd1.length][wrd2.length];
    }
}
