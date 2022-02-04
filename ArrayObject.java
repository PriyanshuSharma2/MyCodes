import java.util.Scanner;
class Student2 {
    String name;
    int roll_no;
    int id;
    Student2(String name, int roll_no, int id)
    {
        this.name=name;
        this.roll_no=roll_no;
        this.id=id;
    }
}
public class StudentArrayObject {
    public static void main(String[] args) {
      Scanner s =new Scanner(System.in);
       Student2[] stu=new Student2[5];
        for (int i = 0; i < stu.length; i++) {
            stu[i]=new Student2(s.next(), s.nextInt(), s.nextInt());
        }
        for (int i = 0; i < stu.length ; i++) {
            System.out.println(stu[i].name+"("+stu[i].roll_no +")"+" "+stu[i].id);
        }
    }
}
