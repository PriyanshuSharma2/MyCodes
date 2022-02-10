import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the element: ");
        int [] arr = new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= sc.nextInt();
        }
        int count =0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>=arr[i+1])
            {

            }
        }
    }
}
