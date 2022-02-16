package LinkedList;//package LinkedList;

import java.util.Scanner;

class node5{
    int data;
    node5 next;
    node5 previous;
    node5(int data)
    {
        this.data = data;
    }
}
public class DoubleyLinkedListUserInput {

    public static void dlt(node5 head,int n) {
        if (head == null) {
            return;
        }
        node5 temp = head;
        int k = 0;
        while (temp != null && k < n-1) {
//            System.out.println(temp.data);
            temp = temp.next;
            k++;
        }
        if(temp.next.next!=null){
            temp.next = temp.next.next;
        }
//        temp.next = temp.next.next;
    }

    public static void add(node5 head,int n,int x) {
        if (head == null) {
            return;
        }
        node5 temp = head;
        int k = 0;
        node5 newnode = new node5(x);
        while (temp != null && k < n-1) {
//            System.out.println(temp.data);
            temp = temp.next;
            k++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
//        temp.next = temp.next.next;
    }

    public static void fromEnd(node5 end) {
        if(end==null){
            return;
        }
        node5 temp = end;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.previous;
        }
    }

    public static void fromFront(node5 head) {
        if(head==null){
            return;
        }
        node5 temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an LinkedList: ");
        int size  = sc.nextInt();
        node5 head = new node5(sc.nextInt());
        node5 temp = head;
        node5 end = head;
        for (int i = 0; i <size-1; i++) {
         temp.next = new node5(sc.nextInt());
         temp.next.previous = temp;
        temp= temp.next;
        end = temp;
        }


//        fromFront(head);
//        fromEnd(end);

        dlt(head,2);
        add(head,3,10);
        fromFront(head);


    }
}
