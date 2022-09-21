class Solution {
    public int minDistance(String word1, String word2) {
        char[] wrd1=word1.toCharArray();
        char[] wrd2=word2.toCharArray();
        int dp[][]=new int[wrd1.length+1][wrd2.length+1];
        int min = 0;
        for(int i=0; i<dp[0].length;i++){
            dp[0][i]=i;
    }
        for(int i=0;i<dp.length;i++){
            dp[i][0]=i;
    }
        for(int i=1;i<=wrd1.length;i++){
            for(int j=1;j<=wrd2.length;j++){
                if(wrd1[i-1]==wrd2[j-1]){
                dp[i][j]=dp[i-1][j-1];
        }
    else
        dp[i][j]=1+Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]);
                 if(dp[i][j]<min) min = dp[i][j];
    }
           
}
return min;
}
}
