class Solution{
    Node divide(int N, Node head){
        // code here
        Node dummynode1 = new Node(-1);
        Node dummynode2 = new Node(-2);
        Node even = dummynode1;
        Node odd = dummynode2;
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data%2==0)
            {
                dummynode1.next = temp;
                temp = temp.next;
                dummynode1 = dummynode1.next;
            }
            else{
                
                dummynode2.next = temp;
                temp = temp.next;
                dummynode2 = dummynode2.next;
            }
        }
        dummynode2.next = null;
        odd = odd.next;
        dummynode1.next = odd;
        return even.next;
    }
}
