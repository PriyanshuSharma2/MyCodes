package Recursion;

import java.util.Scanner;

public class PrintReverseSeries
{
    static void printReverse(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");
        printReverse(n-1);
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
       int num = sc.nextInt();
       printReverse(num);
    }
}
