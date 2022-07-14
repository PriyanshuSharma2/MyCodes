class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	   s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           int min = Integer.MAX_VALUE;
           while(!s.isEmpty()){
               int a = s.pop();
               if(a<min) min = a;
           }
           return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(s.size() == n) return true;
           return false;
           
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           return s.isEmpty();
	}
}
