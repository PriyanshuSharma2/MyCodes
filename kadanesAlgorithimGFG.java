package Array;

import java.util.Scanner;

public class kadanesAlgorithimGFG {
    static int maxSubarray(int[] arr)
    {
        int sum =0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++)
        {
            sum+=arr[i];
            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int [] arr= new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int ans = maxSubarray(arr);
        System.out.println(ans);
    }
}
