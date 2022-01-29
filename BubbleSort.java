package Array;

import java.util.Scanner;
class Array4{
    int size;
    int arr[];
    Array4()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        size = s.nextInt();
        System.out.println("Enter the elements of an array: ");
        arr = new int[size];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = s.nextInt();
        }
    }
    public void bubble_sort()
    {
        for(int i = 0;i< arr.length-1;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    public void display()
    {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
public class BubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array4 obj = new Array4();
        obj.bubble_sort();
        obj.display();
    }
}

