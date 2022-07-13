
// User function Template for Java

class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> stk = new Stack<Integer>();
        Queue<Integer> Q = new LinkedList<>();
        for(int i = 0;i<k;i++)
        {
            stk.push(q.poll());
        }
       
        while(!stk.isEmpty() || !q.isEmpty()){
            if(!stk.isEmpty()) Q.offer(stk.pop());
            else Q.offer(q.poll());
        }
        return Q;
    }
}
