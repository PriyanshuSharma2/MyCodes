class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> stk = new Stack<Integer>();
       int size = q.size();
       for(int  i = 0;i<size;i++)
       {
           stk.push(q.poll());
       }
       while(!stk.isEmpty())
       {
           q.add(stk.pop());
       }
       return q;
    }
}
