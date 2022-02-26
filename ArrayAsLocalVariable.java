package Array;
//Package Array
//Sccaner class
import java.util.Scanner;

public class ArrayAsLocalVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        //Asking user for size of an array
        int size = sc.nextInt();
        //Declaring Array As an Local Variable
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();//I will increrase from 0 to size, here i works as a array index
        }
        System.out.println("Your array");
        //One more lopp for printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
