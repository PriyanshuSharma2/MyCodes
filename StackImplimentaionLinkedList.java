class node
{
    int data;
    node next;
    node(int data)
    {
        this.data = data;
    }
}
class Stack {
    node head;

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return head != null;
    }

    public void push(int data) {
        node newnode = new node(data);
        if (isEmpty()) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("StackUnderFLow");
        }
        head = head.next;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("StackUnderFLow1");
            return;
        }
        System.out.println(head.data);
    }
}
public class practice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack st = new Stack();
            System.out.println("Enter the elements in your stack");
            int x = sc.nextInt();
            while (x != -1) {
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
