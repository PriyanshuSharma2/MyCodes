package LinkedList;

import java.util.Scanner;

class node16
{
    int data;
    node16 next;
    node16(int data)
    {
        this.data = data;
    }
}
public class CircularLinkedListInsertAtBeg {
    public static void display(node16 head)
    {
        node16 temp = head;
        while(temp.next!=head)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an LinkedList: ");
        int size = sc.nextInt();
        System.out.println("Enter the element of an LinkedList");
        node16 head = new node16(sc.nextInt());
        node16 temp = head;
        node16 tail = null;
        for (int i = 0; i < size - 1; i++) {
            temp.next = new node16(sc.nextInt());
            temp = temp.next;
            tail = temp;
        }
        tail.next = head;
        System.out.println("Enter the element you want to add: ");
        node16 newElement = new node16(sc.nextInt());
        newElement.next=head;
        head=newElement;
        tail.next = newElement ;
        System.out.println("Your list after insertion: ");
        display(head);
    }
}
