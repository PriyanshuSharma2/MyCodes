class node
{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
    }
}
class stack
{
    node head;
    public boolean isFull()
    {
        return head.next!=null;
    }
    public boolean isEmpty()
    {
        return head == null;
    }
    public void push(int data)
    {
        node newnode = new node(data);
        if(isEmpty())
        {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("StackOverFLow");
            return;
        }
        head = head.next;
    }
    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("StackOverFlow");
            return;
        }
        System.out.println(head.data);
    }
}
 public class StackByLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack st = new stack();
        System.out.println("Enter the element of LinkedList");
        int x = sc.nextInt();
        while (x!=-1)
        {
            st.push(x);
            x = sc.nextInt();
        }
        node temp = st.head;
        while (temp!=null)
        {
            st.peek();
            st.pop();
            temp=temp.next;
        }
    }
}
