class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<Integer> stk1 = new Stack<Integer>();
        Stack<Integer> stk2 = new Stack<Integer>();
        int[] arr = new int[n];
        int days;
        stk1.push(price[0]);
        stk2.push(1);
        arr[0]=1;
        for(int i=1; i<price.length; i++){
            days=1;
            while(!stk1.isEmpty() && price[i]>=stk1.peek()){
                days+=stk2.pop();
                stk1.pop();
            }
            stk1.push(price[i]);
            stk2.push(days);
            arr[i] = days;
        }
        return arr;
    }
    
}
