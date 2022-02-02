package Array;

import java.util.Scanner;

public class BitonicPointGFG {
    static int bitonicMax(int [] arr)
    {
        int start =0;
        int end = arr.length-1;
        int mid  =0;
        int max =-1;
        while(start<=end)
        {
            mid= (start+end)/2;
            if(arr[mid]==arr[arr.length-1])
            {
                max= arr.length-1;
                break;
            }
            else if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            {
                max=mid;
                break;
            }
            else if(arr[mid]<arr[mid+1])
            {
                start = mid+1;
            }
            else if(arr[mid]>arr[mid+1])
            {
                end = mid-1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the element in Bitonic pattern: ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int ans = bitonicMax(arr);
        System.out.println("Max number found at index: "+ans);
    }
}
