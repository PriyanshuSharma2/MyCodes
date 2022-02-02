package Array;

import java.util.ArrayList;
import java.util.Scanner;
class MyException extends Exception
{
    //super("Give only even size");
}

public class BalancedArrayGFG {
    static int minValueToBalance(int arr[])
    {
        int mid = arr.length/2;
        int sum=0;
        int sum2=0;
        for (int i = 0; i <arr.length; i++) {
            if(i<mid)
            {
                sum+=arr[i];
            }
            else
            {
                sum2+=arr[i];
            }
        }
        if(sum>sum2)
        {
            return sum-sum2;
        }
        else
           return sum2-sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array(Even only): ");
        int size  = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int ans = minValueToBalance(arr);
        System.out.println("Min value require to make array balance: "+ans);
    }
}
