class Solution
{ 
    static ArrayList<Integer> reverse(Stack<Integer> s)
    {
        // add your code here
         ArrayList<Integer> arr = new  ArrayList<Integer>();
        while(!s.isEmpty()){
            arr.add(s.pop());
        }
        
        return arr;
    }
    static void rev(Stack<Integer> s){
        if(!s.isEmpty())
        {
            int a = s.pop();
            reverse(s);
            pushAtBottom(a,s);
        }
    }
    static void pushAtBottom(int a,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(a);
           return;
        }
        int b = s.pop();
        pushAtBottom(a,s);
        s.push(b);
    }
}
