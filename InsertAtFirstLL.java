package LinkedList;

import java.util.Scanner;
class Node2
{
    int data;
    Node2 next;
    Node2(int data)
    {
        this.data=data;
    }
}

public class InsertAtFirstLL {
    public static void display(Node2 head)
    {
        Node2 temp2 = head;
        while (temp2!=null)
        {
            System.out.print(temp2.data+" ");
            temp2=temp2.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an LinkedList: ");
        int size = sc.nextInt();
        Node2 head = new Node2(sc.nextInt());
        Node2 temp = head;
        for (int i = 0; i <size-1; i++) {
            temp.next = new Node2(sc.nextInt());
            temp = temp.next;
        }
        System.out.println("Enter the element you want to insert at begning: ");
        Node2 newnode = new Node2(sc.nextInt());
        newnode.next=head;
        head = newnode;
        System.out.println("List after adding new number at first");
        display(head);
    }
}
