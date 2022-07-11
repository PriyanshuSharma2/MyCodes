class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here
	     q1.offer(a);
	     while(!q2.isEmpty()){
	         q1.offer(q2.poll());
	     }
	     while(!q1.isEmpty()){
	         q2.offer(q1.poll());
	     }
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    if(q2.isEmpty()) return -1;
	    return q2.poll();
    }
	
}
