class Solution {

    public long minValue(long a[], long b[], long n) 
    {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = a.length-1;
        long sum = 0;
        while(i<a.length)
        {
            sum+= (long)a[i]*(long)b[j];
            i++;
            j--;
        }
        return sum;
    }
}
