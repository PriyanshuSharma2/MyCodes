package LinkedList;

import java.util.Scanner;

class node10{
    int data;
    node10 next;
    node10(int data)
    {
        this.data = data;
    }
}
public class ReverseLinkedList {
    public static node10 reverse(node10 head)
    {
        node10 previous = null;
        node10 current = head;
        if(current.next==null)
        {
            return current;
        }
        else {
            while (current != null) {
                node10 temp = current.next;
                current.next = previous;
                previous = current;
                current = temp;
            }
        }
        return previous;
    }
    public static void display(node10 newhead)
    {
        node10 temp = newhead;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an LinkedList: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of LinkedList");
        node10 head = new node10(sc.nextInt());
        node10 temp = head;
        for (int i = 0; i <size-1 ; i++) {
            temp.next = new node10(sc.nextInt());
            temp = temp.next;
        }
        node10 newhead = reverse(head);
        System.out.println("Your list after reverse");
        display(newhead);
    }
}
