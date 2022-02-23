package Stack;

import java.util.Scanner;
class stack1
{
   int[] arr;
   int top;
   stack1(int size)
   {
       arr = new int[size];
       top = -1;
   }
   public boolean isFull()
   {
       if(top==arr.length-1)
           return true;
       else
           return false;
   }
   public boolean isEmpty()
   {
       if(top==-1)
           return true;
       else
           return false;
   }
   public void push(int value)
   {
       if(isFull())
       {
           System.out.println("StackOverFlow");
           return;
       }
       else
       {
           arr[top+1] = value;
           top++;
       }
   }
   public int pop()
   {
       if(isEmpty())
       {
           System.out.println("StackUnderFLow");
       }
           int res = arr[top];
           top--;
       return res;
   }
   public void display()
   {
       for (int i = 0; i <arr.length ; i++) {
           System.out.print(arr[i]+" ");
       }
   }
}
public class StackPopByArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an stack: ");
        int size = sc.nextInt();
        stack1 obj = new stack1(size);
        System.out.println("Now how many elements you want to push(<= stack size): ");
        int no_push_element = sc.nextInt();
        if(no_push_element<=size)
        {
            for (int i = 0; i <no_push_element ; i++) {
                int value = sc.nextInt();
                obj.push(value);
            }
        }
        else
        {
            System.out.println("You have input your push size greater than stack size");
        }
        System.out.println("Enter how many numbers you want to pop: ");
        int no_element_pop = sc.nextInt();
        if(no_element_pop<=size)
        {
            for (int i = 0; i <no_element_pop ; i++) {
                obj.pop();
            }
        }
        else
        {
            System.out.println("You have input your pop size greater than stack size");
        }
        obj.display();
    }
}
