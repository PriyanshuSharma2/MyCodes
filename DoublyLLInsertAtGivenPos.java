package LinkedList;

import java.util.Scanner;

class Node9{
    int data;
    Node9 next;
    Node9 previous;
    Node9(int data)
    {
        this.data = data;
    }
}
public class DoublyLLInsertAtGivenPos {
    public static void display(Node9 head)
    {
        Node9 temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
    }
    public static void add(Node9 head, int position, Node9 newnode)
    {
        Node9 temp = head;
        for (int i = 1; i<position-1;i++)
        {
            temp=temp.next;
        }
        newnode.previous=temp;
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of an LinkedList: ");
      int size = sc.nextInt();
        System.out.println("Enter the elements of an LinkedList: ");
        Node9 head = new Node9(sc.nextInt());
        Node9 temp = head;
        for (int i = 0; i <size-1 ; i++) {
            temp.next = new Node9(sc.nextInt());
            temp.next.previous=temp;
            temp=temp.next;
        }
        System.out.println("Enter the position at which you want to add your element: ");
        int position = sc.nextInt();
        System.out.println("Enter the number: ");
        Node9 newnode = new Node9(sc.nextInt());
        System.out.println("Your list after adding new element");
        add(head,position,newnode);
        display(head);
    }
}
