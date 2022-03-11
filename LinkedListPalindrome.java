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
       node newnode = new node(x);
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
    public static void dispaly()
    {
        node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an linkedList: ");
        int x = sc.nextInt();
        while(x!=-1)
        {
            insert(x);
            x = sc.nextInt();
        }
        dispaly();
        Solution1 s = new Solution1();
        System.out.println(s.isPalindrome(head));
    }
}

class Solution1{
    public node middle(node head)
    {
        node slow = head;
        node fast = head;
        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public node reverse(node mid)
    {
        node current = mid;
        node previous = null;
        while(current!=null)
        {
            node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
    public boolean isPalindrome(node head)
    {
        node mid = middle(head);
        node last = reverse(mid.next);
        node start = head;
        while(last!=null && start!=null)
        {
            if(start.data!=last.data)
            {
                return false;
            }
            start= start.next;
            last= last.next;
        }
        return false;
    }
}
