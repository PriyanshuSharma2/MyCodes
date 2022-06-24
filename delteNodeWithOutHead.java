//Function to delete a node without any reference to head pointer.
class Solution
{
    
    void deleteNode(Node del)
    {
         // Your code here
         Node temp = del;
         Node previous = null;
         while(temp.next!=null)
         {
             temp.data = temp.next.data;
             previous = temp;
             temp = temp.next;
         }
         previous.next = null;
    }
}
