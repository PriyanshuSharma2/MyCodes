class Solution
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {
        // Your code here
        int x = 2;
        return lucky(x,n);
    }
    static boolean lucky(int x, int n)
    {
        if(n<x)
        {
            return true;
        }
        if(n%x==0)
        {
            return false;
        }
        n=n-(n/x);
        x++;
       return lucky(x,n);
    }
}
