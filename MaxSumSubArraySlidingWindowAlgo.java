package Array;

import java.util.Scanner;

public class SlidingWIndow {
    static int maxSum(int[] arr,int key)
    {
        int sum =0;
        int i=0;
        int j=0;
        int max = Integer.MIN_VALUE;
        while(j< arr.length) {
            if(j<key)
            {
                sum = sum+arr[j];
                max = sum;
            }
           else {
                sum=sum+arr[j]-arr[i];
                i++;
                if(sum>max)
                {
                    max=sum;
                }
            }
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array: ");
        int k = sc.nextInt();
        if(k> arr.length)
        {
            System.out.println("Not valid");
        }
        else{
            int ans = maxSum(arr,k);
            System.out.println("The max is: "+ans);
        }
    }
}
