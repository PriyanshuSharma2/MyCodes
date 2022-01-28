import java.util.Arrays;
import java.util.Scanner;

public class WaveArrayGFG {
    static void waveArray(int arr[])
    {
        for (int i=0;i<arr.length-1;i++)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr;
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an array: ");
        arr = new int[size];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        waveArray(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
