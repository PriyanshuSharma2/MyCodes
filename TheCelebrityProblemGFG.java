class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	int[] known = new int[n];
    	int[] know = new int[n];
    	for(int i = 0;i<n;i++){
    	    for(int j = 0;j<n;j++){
    	        if(M[i][j]==1){
    	            known[j]++;
    	            know[i]++;
    	        }
    	    }
    	}
    	for(int i=0;i<n;i++){
    	    if(known[i]==n-1&&know[i]==0){
    	        return i;
    	    }
    	}
    	return -1;
    }
}
