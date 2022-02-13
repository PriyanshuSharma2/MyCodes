package LinkedList;

import java.util.Scanner;

class Node4 {
    int data;
    Node4 next;
    Node4(int data)
    {
        this.data = data;
    }
}
public class DeleteAtFirstLL {
    public static void delete(Node4 head,int size)
    {
        Node4 temp = head;
        for (int i = 0; i < size-2; i++) {
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void display(Node4 head)
    {
        Node4 temp2 = head;
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
        System.out.println("Enter the elements of an LinkedList");
        Node4 head = new Node4(sc.nextInt());
        Node4 temp = head;
        for (int i = 0; i <size-1 ; i++){
            temp.next=new Node4(sc.nextInt());
            temp=temp.next;
        }
       delete(head,size);
        System.out.println("List after deleting last Element");
      display(head);
    }
}
