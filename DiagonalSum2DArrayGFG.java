package Array;

import java.util.Scanner;

public class DiagonalSum2DArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][];
        System.out.println("Enter the row: ");
        int row = sc.nextInt();
        System.out.println("Enter the column: ");
        int col = sc.nextInt();
        arr = new int[row][col];
        System.out.println("Enter the elements");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your Matrix...");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if(i==j)
                {
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println("The sum is "+sum);
    }
}

