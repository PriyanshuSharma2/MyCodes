class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        long area = 0;
        long max= Long.MIN_VALUE;
        for(int i=0; i<hist.length; i++){
            int left = i-1;
            int right = i+1;
            int count1 = 0;
            int count2 = 0;
            while(left>=0 && hist[left]>=hist[i]){
                left--;
                count1++;
            }
            while(right<n && hist[right]>=hist[i]){
                right++;
                count2++;
            }
           area = (count1+count2+1)*hist[i];
           if(area>max) max = area;
        }
        return max;
    }
        
}
