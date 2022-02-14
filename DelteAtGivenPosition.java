package LinkedList;

import java.util.Scanner;

class node2{
    int data;
    node2 next;
    node2(int data)
    {
        this.data = data;
    }
}

public class DelteAtGivenPosition {
    public static  void delete(node2 head, int position)
    {
        node2 temp2 = head;
        for (int i = 0; i <position-1 ; i++) {
            temp2=temp2.next;
        }
        temp2.next=temp2.next.next;
    }
    public static void display(node2 head)
    {
        node2 temp3 = head;
        while (temp3!=null)
        {
            System.out.print(temp3.data+" ");
            temp3=temp3.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an LinkrdList: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an linkedList: ");
        node2 head = new node2(sc.nextInt());
        node2 temp = head;
        for (int i = 0; i <size -1 ; i++) {
              temp.next = new node2(sc.nextInt());
              temp = temp.next;
        }
        System.out.println("Enter the position at which you want to delete the element: ");
        int position = sc.nextInt();
        System.out.println("List after deltion of element: ");
        delete(head,position);
        display(head);
    }
}
