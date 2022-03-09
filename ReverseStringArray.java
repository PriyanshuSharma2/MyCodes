package String;

import java.util.Scanner;

public class ReverseStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your String Array: ");
        int size = sc.nextInt();
        String[] s = new String[size];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }
        System.out.println("Your string you have enter");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }
        System.out.println("\nYour string after reverse");
        int start =0;
        int end =s.length-1;
        while(start<end)
        {
            String temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }
    }
}
