
class Solution 
{
      
    static int removeConsecutiveSame(Vector <String > v) 
    {
        // Your code goes here
       
        Stack<String> stk = new Stack<String>();
        for(String str : v){
            if(stk.isEmpty()){
                stk.push(str);
            }
            else if(str.equals(stk.peek())){
                stk.pop();
            }
            else{
                stk.push(str);
            }
        }
        return stk.size();
    }
}
