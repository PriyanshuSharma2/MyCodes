class node {
    int data;
    node next;
    node(int data)
    {
        this.data = data;
    }
}
public class practice {
    static node head;
    public static void display()
    {
        node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static boolean detectLoop()
    {
        node slow = head;
        node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
         return false;
    }
    public static void main(String[] args) {
        node one = new node(1);
        node two = new node(2);
        node three = new node(3);
        node four = new node(4);
        node five = new node(5);
        node six = new node(6);
        node seven = new node(7);
        node egiht= new node(8);
        head = one;
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        seven.next = egiht;
        egiht.next = null;
        System.out.println(detectLoop());
    }
}
