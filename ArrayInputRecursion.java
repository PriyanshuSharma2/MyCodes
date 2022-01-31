package Recursion;

import java.util.Scanner;

public class ArrayInput {
    static void printArray(int i,int arr[],int sum)
    {
        if(i==arr.length)
        {
            System.out.println("sum is: "+sum);
            return;
        }
        System.out.print(arr[i]+" ");
        printArray(i+1,arr,sum);
    }
    static void inputArray(int arr[],Scanner sc,int i,int sum)
    {
        if(i==arr.length)
        {
            printArray(0,arr,sum);
            return;
        }
        arr[i]=sc.nextInt();
        sum+=arr[i];
        inputArray(arr,sc,i+1,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i;
        int sum;
        System.out.println("Enter the elements of an array:  ");
        inputArray(arr,sc,0,0);
    }
}

