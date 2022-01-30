package Array;

import java.util.ArrayList;
import java.util.Scanner;
class Solution
{
   ArrayList<Integer> valueEqualToIndex(int arr[])
   {
       ArrayList<Integer> Arr =  new ArrayList<>();
       for (int i = 0; i <arr.length ; i++) {
           if(arr[i]==i+1)
           {
               Arr.add(arr[i]);
           }
       }
       return Arr;
   }
}
public class ValueEqualToIndexGFG {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the size of an array: ");
        int size =  sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> Arr = new Solution().valueEqualToIndex(arr);
        if(Arr.size()==0)
        {
            System.out.println("No such element found");
        }
        else
        {
            for (Integer r:Arr) {
                System.out.print(r+" ");
            }
        }
    }
}
