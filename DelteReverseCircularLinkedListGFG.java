class GFG
{
    //This method returns the head of the LL after deleting node with value d.
    public static Node deleteNode(Node head,int d)
    {
        //Add your code here.
        if(head == null)
        {
            return head;
        }
        if(head.data == d)
        {
            head = head.next;
            Node temp = head;
            while(temp.next!=head)
            {
                temp = temp.next;
            }
            temp.next = head;
            return head;
        }
        Node previous = head;
        Node temp = head.next;
        while(temp!=head)
        {
            if(temp.data == d)
            {
                previous.next = temp.next;
                return head;
            }
            previous = temp;
            temp = temp.next;
        }
       
      return head;
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        //Add your code here
         if(head == null || head.next==null)
        {
            return head;
        }
        Node previous = null;
        Node temp = null;
        Node current = head;
        do{
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        } while(current!=head);
        head.next = previous;
        return previous;
    }
}
