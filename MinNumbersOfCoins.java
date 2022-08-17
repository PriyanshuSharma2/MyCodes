class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        int[] coins = {2000,500,200,100,50,20,10,5,2,1};
        int i = 0 ;
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        while(N>0){
            if(coins[i]>N){
                i++;
            }
            else{
                N = N-coins[i];
                Arr.add(coins[i]);
            }
        }
        return Arr;
    }
}
