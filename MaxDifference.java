class Solution
{
    int findMaxDiff(int a[], int n)
    {
	// Your code here
	  int[] left_most_Array = leftSmaller(a);
	  int[] right_most_Array = rightSmaller(a);
	  int max = Integer.MIN_VALUE;
	  
	  for(int i = 0; i<a.length;i++){
	      if(Math.abs(left_most_Array[i]-right_most_Array [i])>max)
               max=Math.abs(left_most_Array [i]-right_most_Array [i]);
	      }
	      return max;
	  }
	  
    
    public int[] leftSmaller(int[] a){
        Stack<Integer> stk1 = new Stack<Integer>();
        int[] array1 = new int[a.length];
        for(int i=0; i<array1.length; i++){
            while(!stk1.isEmpty() && a[i]<=stk1.peek()){
                stk1.pop();
            }
            if(stk1.isEmpty()){
                int b = a[i];
                stk1.push(b);
                array1[i] = 0;
            }
            else{
                array1[i] = stk1.peek();
                stk1.push(a[i]);
            }
        }
        return array1;
        
    }
    public int[] rightSmaller(int[] a){
        Stack<Integer> stk2 = new Stack<Integer>();
        int[] array2 = new int[a.length];
        for(int i=array2.length-1; i>=0; i--){
            while(!stk2.isEmpty() && a[i]<=stk2.peek()){
                stk2.pop();
            }
            if(stk2.isEmpty()){
                int b = a[i];
                stk2.push(b);
                array2[i] = 1;
            }
            else{
                array2[i] = stk2.peek();
                stk2.push(a[i]);
            }
        }
        return array2;
    }
}
