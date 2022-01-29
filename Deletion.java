package Array;

import java.util.Scanner;
class Array1{
    int arr[],size;
    Array1()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        size=s.nextInt();
        arr=new int[size];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
    }
   static void deletion(int index,int arr[])
    {
        for (int i=index;i<arr.length-1;i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
public class DeletionArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Index: ");
        int index=s.nextInt();
        Array1 obj = new Array1();
        System.out.println("Element after deletion");
        Array1.deletion(index, obj.arr);
    }
}

