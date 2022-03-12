class node{
    int data;
    node next;
    node(int data)
    {
        this.data = data;
    }
}
public class practice {
    static node head;
    public static void insert(int x)
    {
      node newnode  = new node(x);
      if(head == null)
      {
          head = newnode;
          return;
      }
      node temp = head;
      while(temp.next!=null)
      {
          temp = temp.next;
      }
      temp.next = newnode;
    }
    public static void diplay()
    {
       node temp = head;
       while(temp!=null)
       {
           System.out.print(temp.data+" ");
           temp = temp.next;
       }
    }
    public static void middle()
    {
        node slow = head;
        node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the elements of an LinkedList: ");
       int x = sc.nextInt();
       while(x!=-1)
       {
           insert(x);
           x = sc.nextInt();
       }
       diplay();
        System.out.println("\nThe middle element is: ");
       middle();
    }
}
