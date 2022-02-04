package Array;

import java.util.Scanner;
class Array{
    int[] arr;
    int size;
    Array()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        size=s.nextInt();
        arr=new int[size];
        System.out.println("Enter the elements of an array....");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=s.nextInt();
        }
    }
    void shifting(int index, int value)
    {
        for (int i=arr.length-1; i>index;i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=value;
        System.out.println("The new array after insertion of new element is...");
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
}
public class InsertionByShiftingArray {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Array obj = new Array();
        System.out.println("Enter the Index: ");
        int index=s.nextInt();
        System.out.println("Enter the value: ");
        int value = s.nextInt();
         obj.shifting(index, value);
    }
}
