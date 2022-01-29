import java.util.Scanner;
public class RotationArray {
    static void rotaion_method(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value from where you want to start rotating: ");
        int index = sc.nextInt();
        int i;
        for (i=index;i<= arr.length;i++)
        {
            if(i==arr.length)
            {

                for (int j= 0;j<index;j++)
                {
                    System.out.print(arr[j]+" ");
                }
                break;
            }
            else
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int arr []=new int[size];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i <arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        rotaion_method(arr);
    }
}
