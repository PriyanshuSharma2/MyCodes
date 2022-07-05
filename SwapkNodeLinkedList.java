*/
class GFG
{
    //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int K)
    {
        // your code here
        if(head == null || head.next == null || K>num ) return head;
        int c = 1;
        Node temp1 = head;
        Node prev1 = null;
        while(c<K){
            prev1 = temp1;
            temp1 = temp1.next;
            c++;
        }
        Node temp2 = head;
        Node prev2 = null;
        c = 1;
        while(c<num-K+1){
            prev2 = temp2;
           temp2 = temp2.next;
           c++;
        }
        if(prev1!=null) prev1.next = temp2;
        if(prev2!=null) prev2.next = temp1;
        
       Node temp3 = temp1.next;
       temp1.next = temp2.next;
       temp2.next = temp3;
       if(K==1) return temp2;
       if(K==num) return temp1;
        return head;
    }
}
