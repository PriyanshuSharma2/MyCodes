import java.util.Scanner;

public class SelectionSortArray {
    static void selection_sort(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            int small=i;
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[small]>arr[j])
                {
                    small=j;
                }
            }
            int temp = arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an array: ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        selection_sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
