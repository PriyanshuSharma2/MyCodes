class Solution {
    void rearrange(int arr[], int n) {
        // code here
       Stack<Integer> stk = new Stack<Integer>();
       Stack<Integer> stk2 = new Stack<Integer>();
        for(int i = n-1 ;i>=0;i--)
        {
            if(arr[i]>=0) stk.push(arr[i]);
            else stk2.push(arr[i]);
        }
        for(int i=0;i<n;i++){
           if(i%2==0 && !stk.isEmpty()){
               arr[i]=stk.pop();
           }else if(i%2!=0 && !stk2.isEmpty()){
               arr[i]=stk2.pop();
           }else if(!stk.isEmpty()){
               arr[i]=stk.pop();
           }else if(!stk2.isEmpty()){
               arr[i]=stk2.pop();
           }
       }
    }
}
