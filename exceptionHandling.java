import java.util.Scanner;
class test2 {
    Scanner scan = new Scanner(System.in);
    int a, b, c;


        test2() {
        System.out.println("Enter the first number: ");
        a = scan.nextInt();
        System.out.println("Enter the second the number: ");
        b = scan.nextInt();
    }


    public void m1() {
        c = a / b;
        System.out.println("The answer is: " + c);
    }
}
public class exceptionHandling{
    public static void main(String[] args) {
        try{
        test2 obj = new test2() ;
        obj.m1();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("End main");
    }
}
