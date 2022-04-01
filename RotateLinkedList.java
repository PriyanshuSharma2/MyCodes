class Solution{
    //Function to rotate a linked list.
    public Node r(Node head)
    {
       Node temp = head;
       Node previous = null;
       while(temp.next!=null)
       {
           previous = temp;
           temp=temp.next;
       }
       temp.next = head;
       previous.next = null;
       head = temp;
       return head;
    }
    public int count(Node head)
    {
        Node temp = head;
        int s = 0;
        while(temp!=null)
        {
            temp = temp.next;
            s++;
        }
    
        return s;
    }
    public Node rotate(Node head, int k) {
        // add code here
        if(head == null || head.next ==null || k==0)
        {
            return head;
        }
        int n = 0;
        Node newhead = head;
        int size = count(head);
       while(n<(size-k))
       {
           newhead = r(newhead);
           n++;
       }
       return newhead;
    }
}
