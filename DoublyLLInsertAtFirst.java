package LinkedList;

import java.util.Scanner;

class Node7
{
    int data;
    Node7 next;
    Node7 previous;
    Node7(int data)
    {
        this.data = data;
    }
}
public class DoublyLLInsertAtFirst {
    public static void display(Node7 head)
    {
        Node7 temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an LinkedList: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an LinkedList: ");
        Node7 head = new Node7(sc.nextInt());
        Node7 temp=head;
        for (int i = 0; i <size-1 ; i++) {
            temp.next=new Node7(sc.nextInt());
            temp.next.previous=temp;
            temp=temp.next;
        }
        System.out.println("Enter the number you want to enter at first: ");
        Node7 newnode = new Node7(sc.nextInt());
        newnode.next=head;
        head.previous=newnode;
        head=newnode;
        display(head);
    }
}
