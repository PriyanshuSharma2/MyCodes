package LinkedList;

import java.util.Scanner;

class Node6
{
    int data;
    Node6 next;
    Node6 previous;
    Node6(int data)
    {
        this.data = data;
    }
}
public class DoublyLLInput {
    public static void display(Node6 head)
    {
        Node6 temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
    }
    public static void insert(Node6 head , int x)
    {
        Node6 temp = head;
        Node6 newnode = new Node6(x);
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next = newnode;
        newnode.previous=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an LinkedList: ");
        int size  = sc.nextInt();
        System.out.println("Enter the elements of an LinkedList: ");
        Node6 head = new Node6(sc.nextInt());
        for (int i = 0; i <size -1 ; i++) {
            int x = sc.nextInt();
            insert(head,x);
        }
        display(head);
    }
}
