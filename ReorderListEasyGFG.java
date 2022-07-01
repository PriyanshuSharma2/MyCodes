class gfg {
    public static Node middle(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node reverse(Node head)
    {
        if(head == null || head.next==null)
        {
            return head;
        }
        Node previous = null;
        Node current = head;
        Node temp = null;
        while(current!=null)
        {
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
    Node reorderlist(Node head) {
        // Your code here
        Node mid = middle(head);
        Node rev = reverse(mid.next);
        mid.next = null;
        Node temp = head;
        Node newlist = new Node(-1);
        while(rev!=null)
        {
            newlist.next = temp;
            temp = temp.next;
            newlist = newlist.next;
            newlist.next = rev;
            rev = rev.next;
            newlist = newlist.next;
        }
        newlist.next = temp;
        return head;
    }
}
