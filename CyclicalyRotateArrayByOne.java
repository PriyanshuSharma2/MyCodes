package Array;
//Importing Scanner class
import java.util.Scanner;

public class CyclicalyRotateArrayByOne
{
    //Method to rotate an array
    static void rotation(int arr[])
    {
        int temp= arr[arr.length-1];//storing the last element of array in to temp
        //Traversing the array from last(size-1) and shifting the elements in left to right direction
        for (int i = arr.length-1; i>0; i--)
        {
            arr[i]=arr[i-1];//arr[5]=arr[4],arr[4]=arr[3].....
        }
     arr[0]=temp;//storing the last element in to first(swaping)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i]=sc.nextInt();
        }
        rotation(arr);
        System.out.println("Array after rotation by one");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
