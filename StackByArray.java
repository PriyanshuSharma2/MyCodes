package Stack;

import java.util.Scanner;

class stack
{
    int [] arr;
    int top;
    stack(int size)
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
    public void push(int val)
    {
        if(isFull())
        {
            System.out.println("StackOver FLow");
            return;
        }
        else
        {
            arr[top+1] = val;
            top++;
        }
    }
    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("StackUnderFLow");
            return;
        }
        else
        {
            top--;
        }
    }
    public void display()
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

public class StackByArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of an stack: ");
        int size  = sc.nextInt();
        stack obj = new stack(size);
            System.out.println("Enter the number of elements you want to push: ");
            int numberElementPush = sc.nextInt();
            System.out.println("Enter the values");
            if(numberElementPush<=size) {
                for (int i = 0; i < numberElementPush; i++) {
                    int val = sc.nextInt();
                    obj.push(val);
                }
            }
            else {
                System.out.println("Array Index out of bond");
                return;
            }
        obj.display();
    }
}
