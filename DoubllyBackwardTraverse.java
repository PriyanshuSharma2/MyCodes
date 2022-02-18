package LinkedList;

import java.util.Scanner;

class node12
{
    int data;
    node12 next;
    node12 previous;
    node12 (int data)
    {
        this.data = data;
    }
}
public class DoubllyBackwardTraverse {
    public static void backTraverse(node12 end)
    {
        node12 temp = end;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.previous;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an LinkedList: ");
        int size = sc.nextInt();
        System.out.println("Enter the elemnets of an LinkedList: ");
        node12 head = new node12(sc.nextInt());
        node12 temp = head;
        node12 end  = null;
        for (int i = 0; i < size-1; i++) {
            temp.next = new node12(sc.nextInt());
            temp.next.previous =temp;
            temp=temp.next;
            end = temp;
        }
        System.out.println("Your list after back traverse");
        backTraverse(end);
    }
}
