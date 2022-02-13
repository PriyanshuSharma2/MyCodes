package LinkedList;

import java.util.Scanner;

class node
{
    int data;
    node next;
    node(int data)
    {
        this.data = data;
    }
}
public class DeleteAtFirstLL {
    public static void display(node head)
    {
        node temp2 = head;
        while(temp2!=null)
        {
            System.out.print(temp2.data+" ");
            temp2=temp2.next;
        }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an LinkedList: ");
        int size =  sc.nextInt();
        System.out.println("Enter the elements of an LinkedList: ");
        node head = new node(sc.nextInt());
        node temp = head;
        for (int i = 0; i <size -1 ; i++) {
            temp.next = new node(sc.nextInt());
            temp = temp.next;
        }
        head = head.next;
        System.out.println("LL after deletion of element ");
        display(head);
    }
}
