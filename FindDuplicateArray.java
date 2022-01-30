package Array;

import java.util.Scanner;
public class FindDuplicateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sie of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elments of an array: ");
        int arr[]= new int[size];
        for(int i = 0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i =0 ;i<arr.length-1;i++)
        {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i]==arr[j])
                {
                    System.out.print(j+1 +" ");
                }
            }
        }
    }
}

