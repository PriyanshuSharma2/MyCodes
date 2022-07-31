class Solution {
    
   public Node insertInMid(Node head, int data){
       
       Node slow=head;
       Node fast=head;
       
       while(fast.next!=null && fast.next.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       
       Node ele=new Node(data);
       ele.next=slow.next;
       slow.next=ele;
       
       return head;
   }
}
