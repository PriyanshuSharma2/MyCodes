
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            hs.add(b[i]);
        }
        return hs.size();
    }
}
