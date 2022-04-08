class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        char ch ;
        for(int i =0;i<s.length();i++)
        {
            ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                stk.push(ch);
            }
            else{
                if(stk.isEmpty())
                {
                    return false;
                }
                else
                {
                    char CH;
                    if(ch == ')' || ch == '}' || ch == ']')
                    {
                        CH = stk.peek();
                        if(CH == ch)
                        {
                            return false;
                        }
                        else
                        {
                           if((ch == ')' && CH == '(' ) || 
                             (ch == '}' && CH == '{') ||
                             ( ch == ']' && CH == '[')) 
                           {
                               stk.pop();
                           }
                            else
                            {
                                return false;
                            }
                        }
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        if(stk.isEmpty())
        {
            return true;
        }
        else
            return false;
    }
}
