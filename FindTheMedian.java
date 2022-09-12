class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        int low =0;
        int high = v.length-1;
        int mid = 0;
            mid = low+high/2;
            if(v.length%2==1) return v[mid];
        return (v[mid]+v[mid+1])/2;
    }
}
