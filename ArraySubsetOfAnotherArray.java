
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        if(m>n) return "No";
        HashSet<Long> s = new HashSet<Long>();
        int i = 0;
        while(i<n){
            s.add(a1[i]);
            i++;
        }
        for(int j = 0; j<a2.length; j++){
            if(!s.contains(a2[j])){
                return "No";
            }
        }
         return "Yes";
    }         
}
