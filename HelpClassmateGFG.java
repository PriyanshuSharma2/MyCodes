class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    Stack<Integer> stk = new Stack<Integer>();
        int[] arr2 = new int[arr.length];
        for(int i =n-1; i>=0; i--){
         while(!stk.isEmpty()&&arr[i]<=stk.peek()){
                   stk.pop();
                }
        if(stk.isEmpty()){
            int a = arr[i];
            stk.push(a);
            arr2[i] = -1;
        }
        else if(arr[i]>stk.peek()){
            arr2[i] = stk.peek();
            int b = arr[i];
            stk.push(b);
        }
            }
            return arr2;
    }
}
