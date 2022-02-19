package LinkedList;

import java.util.Scanner;
class Node11
{
    int data;
    Node11 next;
    Node11(int data)
    {
        this.data = data;
    }
}
public class FindNFromLastDeleteLeetcode {
    public static int count(Node11 head)
    {
        int c = 0;
        Node11 temp = head;
        while(temp!=null)
        {
            c++;
            temp = temp.next;
        }
        return c;
    }
    public static void deleteNode(Node11 head, int k)
    {
        Node11 temp =head;
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public static void display(Node11 head)
    {
        Node11 temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an LinkedList: ");
        int size  =  sc.nextInt();
        System.out.println("Enter the element of an LinkedList: ");
        Node11 head = new Node11(sc.nextInt());
        Node11 temp = head;
        for (int i = 0; i <size-1 ; i++)
        {
            temp.next = new Node11(sc.nextInt());
            temp = temp.next;
        }
        int Count = count(head);
        System.out.println("Enter the node you want to delte from last: ");
        int index = sc.nextInt();
        int k = Count - index;
        System.out.println(k);
        System.out.println("Your List after delteting element");
        deleteNode(head,k);
        display(head);
    }
}
