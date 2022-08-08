class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i = 0; i<a.length; i++)
        {
            if(!m.containsKey(a[i]))
            {
                m.put(a[i],1);
            }
            else {
                int count = m.get(a[i]);
                count++;
                m.put(a[i],count);
            }
            if(m.get(a[i])==k) return a[i];
        }
        return -1;
    } 
}
