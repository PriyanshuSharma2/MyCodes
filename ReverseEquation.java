class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
        String res = "";
        String str = "";
        for(int i =0;i<S.length();i++){
            if(S.charAt(i)=='+' ||
            S.charAt(i)=='-' || 
            S.charAt(i)=='/' || 
            S.charAt(i)=='*')
            {
                res = S.charAt(i)+str+res;
                str="";
            }
            else{
                str += S.charAt(i);
            }
            
        }
        res=str+res;
        return res;
    }
}
