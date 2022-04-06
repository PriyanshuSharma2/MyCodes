package Stack;

import java.util.Stack;

public class PushAtBottomOFStack {
    public static void pushAtBottom(Stack<Integer> stk, int data)
    {
        if(stk.isEmpty())
        {
            stk.push(data);
            return;
        }
        int top = stk.pop();
        pushAtBottom(stk,data);
        stk.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        pushAtBottom(stk,60);
        while(!stk.isEmpty())
        {
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}
