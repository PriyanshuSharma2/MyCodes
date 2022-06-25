class gfg
{
        // Function  to split a circular LinkedList
	    void splitList(circular_LinkedList list)
        {
             // Your code here
             if(list== null || list.head.next == null)
             {
                 return;
             }
             Node slow = list.head;
             Node fast = list.head.next;
             while(fast!=list.head && fast.next!=list.head)
             {
                 slow = slow.next;
                 fast = fast.next.next;
             }
             list.head2 = slow.next;
             slow.next = list.head;
             list.head1 = list.head;
             Node temp = list.head2;
             while(temp.next!=list.head)
             {
                 temp = temp.next;
             }
             temp.next = list.head2;
             
	 }
}
