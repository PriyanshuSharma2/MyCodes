class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    // Your code here
	    if(input.isEmpty()) return -1;
	        while(!input.isEmpty()){
	            output.push(input.pop());
	        }
	    int a = output.pop();
	    while(!output.isEmpty()){
	            input.push(output.pop());
	        }
	    return a;
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    // Your code here	
	    input.push(x);
    }
}
