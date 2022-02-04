package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TransactionPointAmazonGFG{
    static int transactionPoint(int arr[])
    {
        int start = 0;
        int end =arr.length-1;
        int mid=0;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(arr[mid]==0 && arr[mid]<arr[mid+1])
            {
                return mid+1;
            }
            else if(arr[mid]==0)
            {
                start=mid+1;
            }
            else if(arr[mid]==1)
            {
                end=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int [] arr= new int[size];
        System.out.println("Enter the elements(only 0 and 1)");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[0]==1)
        {
            System.out.println("1");
        }
        else if(arr[arr.length-1]==0)
        {
            System.out.println("1 is not found so their is no transaction point");
        }
        else
        {
            int ans = transactionPoint(arr);
            System.out.println(ans);
        }
    }
}
