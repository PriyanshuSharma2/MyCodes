package Stack;

import java.util.Scanner;

class stack3{
    char[] arr ;
    int top;
    stack3(int size)
    {
        arr = new char[size];
        top =-1;
    }
    public void push(char ch)
    {
       if(top == arr.length)
       {
           System.out.println("StackOverFLow");
           return;
       }
       top++;
       arr[top] = ch;
    }
    public String pop()
    {
        if(top==-1)
        {
            return "StackUnderFLow";
        }
        String ans ="";
        while(top!=-1)
        {
            ans = ans + arr[top--];
        }
        return ans;
    }
}

public class ReverseStringByStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string withoutSpace");
        String S = sc.next();
        stack3 stk = new stack3(S.length());
        for (int i = 0; i <S.length() ; i++) {
            stk.push(S.charAt(i));
        }
        System.out.println(stk.pop());
    }
}
