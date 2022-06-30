class Solution {
    public void alternatingSplitList(Node head){
       //Your code here
       GFG obj = new GFG();
       if( head.next == null)
       {
           obj.a = head;
       }
       Node even = head.next;
       Node odd  = head;
       Node odd_head = odd;
       Node even_head = even;
       while(even!=null && even.next!=null)
       {
           odd.next = odd.next.next;
           even.next = even.next.next;
           odd = odd.next;
           even = even.next;
       }
       odd.next = null;
       
       obj.a = odd_head;
       obj.b = even_head;
    }
    
}
