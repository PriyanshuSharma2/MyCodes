lass node
{
    int data;
    node next;
    node(int data)
    {
        this.data = data;
    }
}
public class practice {
     static node head;
    public static  void input(int x)
    {
       node newmode = new node(x);
       if(head == null)
       {
           head = newmode;
           return;
       }
       node temp = head;
       while(temp.next!=null)
       {
           temp = temp.next;
       }
       temp.next = newmode;
    }
    public static void display()
    {
        node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void addFirst(int x)
    {
        node newnode = new node(x);
        if(head==null)
        {
            head = newnode;
            return;
        }
        newnode.next = head;
        head=newnode;
    }
    public static void addLast(int x)
    {
        node newnode = new node(x);
        if(head==null)
        {
            head= newnode;
            return;
        }
        node temp = head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an LinkedList: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an linkedList: ");
        for (int i = 0; i <size; i++) {
            int x=  sc.nextInt();
            input(x);
        }
        System.out.println("This your list");
        display();
        System.out.println("\nDo you want to add more element at begning press 1 at last press 0: ");
        int op = sc.nextInt();
        if(op==1)
        {
            addFirst(sc.nextInt());
            display();
        }
        else if(op==0)
        {
            addLast(sc.nextInt());
            display();
            return;
        }
        else
        {
            return;
        }
    }
}
