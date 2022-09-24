class Solution {
    public int reverse(int x) {
        int pop = 0;
        long rev_num = 0;
        boolean isneg = x<0;
        if(isneg){
            x*=-1;
        }
        while(x!=0){
            pop = x%10;
            rev_num =  rev_num*10+pop;
            if(rev_num>=Integer.MAX_VALUE || rev_num<=Integer.MIN_VALUE) return 0;
            x/=10;
        }
        return (isneg)?  (int)rev_num*-1: (int)rev_num;
    }
}
