class GetMin
{
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code hereS
        Stack<Integer> stk1 = new Stack<Integer>();
        Stack<Integer> stk2 = new Stack<Integer>();
            stk1.push(arr[0]);
            stk2.push(arr[0]);
            for(int i = 1; i< arr.length;i++)
            {
                stk1.push(arr[i]);
                if(stk1.peek()<=stk2.peek()){
                    stk2.push(arr[i]);
                }
                else{
                    stk2.push(stk2.peek());
                }
            }
            return stk2;
    }
    
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    }
}
