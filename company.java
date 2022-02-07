package Array;

import java.util.Scanner;
class Salesman
{
    int product[];
    Salesman()
    {
        Scanner s =new Scanner(System.in);
        product= new int[15];
        for (int i = 0;i<3;i++)
        {
            System.out.println("Enter the sale of item "+ (i+1));
            product[i]=s.nextInt();
        }
    }
    public void total_sale()
    {
        int sum = 0;
        int i;
        for ( i=0;i< product.length;i++)
        {
            sum=sum+product[i];
        }
        System.out.println("Total sale by Salesman is "+sum);
    }
}
public class Company {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Salesman[] salesman = new Salesman[5];
        for(int i = 0; i< salesman.length;i++)
        {
            System.out.println("Enter the sale of Salesman "+ (i+1));
            salesman[i] = new Salesman();
            salesman[i].total_sale();
        }
    }
}

