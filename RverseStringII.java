class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
       int low;
       int high;
        char temp = 0;
        for(int i = 0; i<s.length(); i+=2*k){
            low = i;
            high = Math.min(low+k-1, ch.length-1);
            while(low<high){
                temp = ch[low];
                ch[low] = ch[high];
                ch[high] = temp;
                low++;
                high--;
            }
        }
        return new String(ch);

    }
}
