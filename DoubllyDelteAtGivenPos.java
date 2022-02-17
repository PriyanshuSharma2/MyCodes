package LinkedList;

import java.util.Scanner;

class node9
{
    int data;
    node9 next;
    node9 previous;
    node9(int data)
    {
        this.data = data;
    }
}
public class DoubllyDelteAtGivenPos {
    public static void deleteAtPos(node9 head, int pos) {
        node9 temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.previous = temp;
    }

    public static void display(node9 head) {
        node9 temp = head;
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an LinkedList: ");
        int size = sc.nextInt();
        System.out.println("Enter the element of LinkedList: ");
        node9 head = new node9(sc.nextInt());
        node9 temp = head;
        for (int i = 0; i < size - 1; i++) {
            temp.next = new node9(sc.nextInt());
            temp.next.previous = temp;
            temp = temp.next;
        }
        System.out.println("Enter the position at which you want to delte your number: ");
        int position = sc.nextInt();
        deleteAtPos(head, position);
        System.out.println("Your list after deletion");
        display(head);
    }
}
