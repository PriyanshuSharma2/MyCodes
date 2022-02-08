package Array;

import java.util.Scanner;

public class MaxInSubArray {
    static int maxElement(int[] arr,int k)
    {
        int max =Integer.MIN_VALUE;
        for (int i = 0; i <=arr.length-k; i++){
            for (int j = i; j <= i+k-1; j++) {
                if(arr[j]>max)
                {
                    max=arr[j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size =  sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the size of subarray: ");
        int k = sc.nextInt();
        if(arr.length<k)
        {
            System.out.println("Invalid");
        }
        else {
            int ans = maxElement(arr, k);
            System.out.println("The max element is: "+ans);
        }
    }
}
