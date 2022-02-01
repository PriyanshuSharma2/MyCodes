package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchMultipleElement{
    static ArrayList<Integer> display(int arr[],int last, int initial)
    {
        ArrayList<Integer> Arr = new ArrayList<>();
        for (int i = initial; i<=last; i++) {
           Arr.add(i);
        }
        return Arr;
    }
    static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static ArrayList<Integer> binarySearch(int arr[], int key)
    {
        int start = 0;
        int end = arr.length-1;
        int mid =0;
        int initial = 0;
        if(arr[0]==key)
        {
            initial=0;
        }
        else if(arr[0]!=key) {
            while (start <= end) {
                mid = (start + end) / 2;
                if (arr[mid] == key && arr[mid] > arr[mid - 1]) {
                    initial = mid;
                    break;
                } else if (arr[mid] < key) {
                    start = mid + 1;
                } else if (arr[mid] > key || arr[mid] == arr[mid - 1]) {
                    end = mid - 1;
                }
            }
        }
            int start2= 0;
            int end2 = arr.length-1;
            int last = 0;
            int mid2 = 0;
        if(arr[arr.length-1]==key)
        {
            last = arr.length-1;

        }
        else if(arr[arr.length-1]!=key)
        {
            while(start2<=end2)
            {
                mid2 = (start2+end2)/2;
                if(arr[mid2]==key && arr[mid2]<arr[mid2+1])
                {
                    last=mid2;
                    break;
                }
                else if(arr[mid2]<key||arr[mid2]==arr[mid2+1 ])
                {
                    start2=mid2+1;
                }
                else if(arr[mid2]>key){
                    end2=mid2-1;
                }
            }
        }
        return display(arr,last,initial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the element of an array: ");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to serach: ");
        int key = sc.nextInt();
        bubbleSort(arr);
        ArrayList<Integer> Arr=  binarySearch(arr,key);
        if(Arr.size()==0)
        {
            System.out.println("NOT FOUND");
        }
        else {
            System.out.println("ELement found on the index: ");
            for (Integer x : Arr) {
                System.out.print(x + " ");
            }
        }
    }
}
