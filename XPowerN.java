package Recursion;

import java.util.Scanner;

public class XPowerN {
    static int power(int num, int power)
    {
        if(power==0)
        {
            return 1;
        }
        return power(num,power-1)*num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the power: ");
        int power = sc.nextInt();
        int ans =power(num,power);
        System.out.println(ans);
    }
}
