package Recursion;

import java.util.Scanner;

public class NumberOfDigit {
    static int count(int num, int count)
    {
        if(num==0)
        {
            return count;
        }
        num = num/10;
        return count(num,count+1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int count;
        int ans = count(num,0);
        System.out.println("The number of digit is: "+ans);
    }
}
