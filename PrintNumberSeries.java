package Recursion;

import java.util.Scanner;

public class PrintNumberSeries {
    static void printSeries(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printSeries(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the number: ");
        int num = sc.nextInt();
        printSeries(num);
    }
}
