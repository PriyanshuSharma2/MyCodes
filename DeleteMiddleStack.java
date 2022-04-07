class Solution
{
    //Function to delete middle element of a stack.
    public void delete(Stack<Integer>s, int mid, int count)
    {
    if(count == mid)
    {
        s.pop();
        return;
    }
    
        int top = s.pop();
        delete(s,mid,count+1);
        s.push(top);
    }
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
       int count=0;
       int mid = sizeOfStack/2;
       if(sizeOfStack%2==0)
       {
           delete(s,mid,0);
       }
       else
       {
           delete(s,mid+1,1);
       }
    } 
}
