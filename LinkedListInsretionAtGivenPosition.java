package LinkedList;
import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}

public class basic {
    public static void insert(Node head, int position,Node number)
    {
        Node temp = head;
        for (int i = 0; i <position-1 ; i++) {
            temp=temp.next;
        }
        number.next=temp.next;
        temp.next=number;
    }
    public static void display(Node head,int size)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an LinkedList: ");
        int size = sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node temp = head;
        for (int i = 0; i <size-1 ; i++) {
            temp.next=new Node(sc.nextInt());
            temp=temp.next;
        }
        System.out.println("Enter the position at which you want to insert the number: ");
        int position = sc.nextInt();
        System.out.println("Enter the new number you want to insert: ");
        Node number = new Node(sc.nextInt());
        insert(head,position,number);
        System.out.println("New list after inserting new element: ");
        display(head,size);
    }
}
