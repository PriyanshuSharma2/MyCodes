import java.util.Scanner;
class a{
    int arr[];
    a(int size)
    {
        Scanner s = new Scanner(System.in);
        arr=new int[size];
        System.out.println("Enter the element");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
    }
    public void insertion(int index, int value)
    {
        for (int i=arr.length-1;i>index;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[index]=value;
    }
    public void deletion(int index)
    {
        for (int i=index;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
    }
    public void linear_Searching(int value)
    {
        int count=0;
        for (int i = 0; i <arr.length; i++)
        {
          if(arr[i]==value)
          {
              System.out.println(i+1 +" ");
              count++;
          }
        }
        if(count==0)
        {
            System.out.println("Element not present");
        }
    }
    public void bubble_sort()
    {
        for(int i = 0;i< arr.length-1;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    public void binary_search(int value)
    {
        int start = 0;
        int end = arr.length;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==value)
            {
                System.out.print("Value find at: "+mid +" ");
                break;
            }
            else if(arr[mid]<value)
            {
                start=mid+1;
            }
            else if(arr[mid]>value)
            {
                end=mid-1;
            }
        }
    }
    public void display()
    {
        for (int i = 0; i <arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
public class MenuDriven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Select The numbers given below according to your operation....");
        System.out.println("Insertion: 1\nDeletion: 2\nLinear Searching: 3\nBinary Searching: 4");
        System.out.print("Your OPeration: ");
        int operation=s.nextInt();
        System.out.println("Also given the size of an array: ");
        int size=s.nextInt();
        a obj = new a(size);
        if(operation==1)
        {
            System.out.println("Enter the index: ");
            int index = s.nextInt();
            System.out.println("Enter the value: ");
            int value = s.nextInt();
            obj.insertion(index,value);
            System.out.println("Array after insertion...");
            obj.display();
        }
        else if(operation==2)
        {
            System.out.println("Enter the index: ");
            int index = s.nextInt();
            obj.deletion(index);
            System.out.println("Array after deletion...");
            obj.display();
        }
        else if(operation==3)
        {
            System.out.println("Enter the value: ");
            int value = s.nextInt();
            obj.linear_Searching(value);
        }
        else if(operation==5)
        {
            System.out.println("Enter the value: ");
            int value = s.nextInt();
            obj.bubble_sort();
            obj.binary_search(value);
        }
    }
}
