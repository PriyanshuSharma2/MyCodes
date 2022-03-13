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
    public static int count()
    {
        int c = 0;
         node temp = head;
         while(temp!=null)
         {
             c++;
             temp = temp.next;
         }
         return c;
    }
    public static boolean isPalindrome(int[] arr)
    {
        int i =0;
        node temp = head;
        while(temp!=null && i<arr.length)
        {
            arr[i] = temp.data;
            i++;
            temp = temp.next;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            if(arr[start]!=arr[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
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
    public static void display()
    {
        node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
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
        int size = count();
        int [] arr = new int[size];
        System.out.println(isPalindrome(arr));
    }
}
