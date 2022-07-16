class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long> stk = new Stack<Long>();
        long[] arr2 = new long[arr.length];
        for(int i =n-1; i>=0; i--){
         while(!stk.isEmpty()&&arr[i]>=stk.peek()){
                   stk.pop();
                }
        if(stk.isEmpty()){
            long a = arr[i];
            stk.push(a);
            arr2[i] = -1;
        }
        else if(arr[i]<stk.peek()){
            arr2[i] = stk.peek();
            long b = arr[i];
            stk.push(b);
        }
            }
            return arr2;
    }

}
