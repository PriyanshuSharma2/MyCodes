//Programm to search Element in array.
//User input the Array and value to be search.
import java.util.Scanner;
public class SearchingArray {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        //Declaring array and its size.
        int arr[],size;
        try {
            System.out.println("Enter the size of an array: ");
            //Taking array size.
            size = s.nextInt();
            //Creating array.
            arr = new int[size];
            System.out.println("Enter the Elements of an array: ");
            //taking elements of array from user.
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println("Enter the number you want to search in the array: ");
            int search_value = s.nextInt();
        int count=0;
        //searching the element int the array.
        for (int i=0;i<arr.length;i++)
        {
            if(search_value==arr[i])
            {
                System.out.println("The element "+search_value+" is present at index "+(i+1));
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("Element is not present in the given array");
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("End of main");
    }
}
