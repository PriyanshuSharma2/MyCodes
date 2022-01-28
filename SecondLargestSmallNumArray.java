import java.util.Scanner;

public class SecondLargeSmallNumArray {
    static int second_large(int arr[])
    {
        int large=arr[0];
        int second_large = arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                second_large=large;
                large=arr[i];
            }
            else if(arr[i]>second_large && arr[i]!=large)
            {
                second_large=arr[i];
            }
        }
        return second_large;
    }

    static int second_small(int arr[]) {
        int small = arr[0];
        int second_small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] <    second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        return second_small;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Second largest: 1\nSecond Small: 2");
        int op = sc.nextInt();
        if(op==1)
        {
            System.out.println("Second Largest: "+second_large(arr));
        }
        if(op==2)
        {
            System.out.println("Second Smallest: "+second_small(arr));
        }
    }
}
