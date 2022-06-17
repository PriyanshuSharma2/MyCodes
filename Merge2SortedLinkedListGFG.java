class LinkedList
{
   
    Node sortedMerge(Node head1, Node head2) {
     
     if(head1 == null) return head2;
     if(head2 == null) return head1;
     Node dummyNode = new Node(-1);
     Node head3 = dummyNode;
     while(head1!=null && head2!=null)
     {
         if(head1.data<head2.data)
         {
            head3.next = head1;
            head3 = head3.next;
            head1 = head1.next;
         }
         else
         {
             
            head3.next = head2;
            head3 = head3.next;
            head2 = head2.next;
         }
     }
     if(head1==null)
     {
         head3.next = head2;
     }
     if(head2==null)
     {
         head3.next = head1;
     }
     return dummyNode.next;
   } 
}
