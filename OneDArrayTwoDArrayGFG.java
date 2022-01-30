package Array;
//This program take two arrays from user(1-D and 2-D)
//find the sum of the left diagonal values of the 2-d
// array and the max element of the 1-d array and print
// them with space in between.

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
//Driver class
class Solution2
{
    ArrayList<Integer> LeftDiagonalSumMaxElement(int arr1[],int arr2[][])
    {
        int max=Integer.MIN_VALUE;
        int sum =0;
        ArrayList<Integer> Arr = new ArrayList<>();
        for(int i=0;i< arr1.length;i++)
        {
           if(arr1[i]>max)
           {
               max=arr1[i];
           }
           sum+=arr2[i][i];
        }
        Arr.add(max);
        Arr.add(sum);
        return Arr;
    }
}
public class OneDArrayTwoDArrayGFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Scanner class object
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();//1-d array size
        int[] arr1,arr2[];
        arr1= new int[size];
        arr2= new int[size][size];
        for (int i=0;i<arr1.length;i++)
        {
            System.out.println("Enter the "+i+" element of array 1: ");
            arr1[i]=sc.nextInt();
            for (int j = 0; j < arr2.length; j++) {
                System.out.println("Enter the "+i+" "+j+" element of array 2: ");
                arr2[i][j]=sc.nextInt();
            }
        }
        ArrayList<Integer> Arr = new Solution2().LeftDiagonalSumMaxElement(arr1,arr2);
        for (Integer x:Arr) {
            System.out.print(x+" ");
        }
    }
}
