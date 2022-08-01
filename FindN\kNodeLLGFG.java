class GfG
{
    public static int count(Node head)
    {
        int c = 0;
        Node temp = head;
        while(temp!=null)
        {
            c++;
            temp = temp.next;
        }
        return c;
    }
    public static int nknode(Node head, int k)
    {
       // add your code here
       int size = count(head);
       Node temp = head;
       int i = 0;
       if(size%k==0){
        
           while(i<nthNode-1){
               temp = temp.next;
               i++;
           }
           return temp.data;
       }
       while(i<nthNode){
               temp = temp.next;
               i++;
           }
           return temp.data;
    }
}
