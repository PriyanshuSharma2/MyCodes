 public static Node reverse(Node head)
    {
        if(head == null || head.next==null)
        {
            return head;
        }
        Node previous = null;
        Node temp = null;
        Node current = head;
        while(current!=null)
        {
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
     public static Node reverse2(Node head)
    {
        if(head == null || head.next==null)
        {
            return head;
        }
        Node previous = null;
        Node temp = null;
        Node current = head;
        while(current!=null)
        {
            temp = current.prev;
            current.prev = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
    public static Node reverseDLL(Node  head)
{
     Node newhead = reverse(head);
     Node newhead2 = reverse2(newhead);
     return newhead;
}
