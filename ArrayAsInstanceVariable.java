package Array;

import java.util.Scanner;

public class ArrayAsInstanceVar {
    //Declaring Array as Insatnce Variable
    //Whenever we are declaring array as an instance variable, We never define it's
    //Size at the time of defining, because class is an logical entity
    //and it doesnot reserved memory,memory occupied when object creat.
    int [] arr;
    //We use constructor for creating Array.
    ArrayAsInstanceVar(int size)
    {
        arr = new int[size];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size  = sc.nextInt();
        System.out.println("Enter the elements in array");
        ArrayAsInstanceVar obj = new ArrayAsInstanceVar(size);
        for (int i = 0; i <obj.arr.length ; i++) {
            obj.arr[i] = sc.nextInt();
        }
        System.out.println("The elements are");
        for (int i = 0;i<obj.arr.length;i++)
        {
            System.out.print(obj.arr[i]+" ");
        }
    }
}
