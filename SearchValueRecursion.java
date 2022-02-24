package Recursion;

import java.util.Scanner;

public class SearchValue {
    static  int search(int arr[],int key,int count_index)
    {
        if(arr[count_index]==key)
        {
            return count_index;
        }
        return search(arr,key,count_index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search: ");
        int key = sc.nextInt();
        System.out.println("Enter the size of an array: ");
        int size  = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int count_index=1;
        int ans =search(arr,key,count_index);
        System.out.println(ans);
    }
}
