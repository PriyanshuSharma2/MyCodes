package LinkedList;

import java.util.Scanner;

class Node8
{
    int data;
    Node8 next;
    Node8 previous;
    Node8(int data)
    {
        this.data = data;
    }
}
public class DoublyLLInsertAtLast {
    public static void display(Node8 head)
    {
        Node8 temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of an LinkedList: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an LinkedList");
        Node8 head = new Node8(sc.nextInt());
        Node8 temp = head;
        for (int i = 0; i <size-1 ; i++) {
            temp.next=new Node8(sc.nextInt());
            temp.next.previous = temp;
            temp=temp.next;
        }
        System.out.println("Enter the number you want to add at last: ");
        Node8 last = new Node8(sc.nextInt());
        temp.next=last;
        temp.next.previous=temp;
        display(head);
    }
}
