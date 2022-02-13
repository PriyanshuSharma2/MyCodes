package LinkedList;

import java.util.Scanner;

class Node3
{
    int data;
    Node3 next;
    Node3(int data)
    {
        this.data = data;
    }
}
public class InsertAtLastLL{
    public static void display(Node3 head)
    {
        Node3 temp2 = head;
        while(temp2!=null)
        {
            System.out.print(temp2.data+" ");
            temp2=temp2.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an LinkedList: ");
        int size  = sc.nextInt();
        System.out.println("Enter the elements of LinkedList");
        Node3 head = new Node3(sc.nextInt());
        Node3 temp = head;
        for (int i = 0; i <size -1 ; i++) {
            temp.next = new Node3(sc.nextInt());
            temp = temp.next;
        }
        System.out.println("Enter the element you want to add: ");
        Node3 newnode = new Node3(sc.nextInt());
        temp.next=newnode;
        System.out.println("List after adding last element");
        display(head);
    }
}
