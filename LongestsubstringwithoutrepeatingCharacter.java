class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        HashSet<Character> ch = new HashSet<Character>();
        int i = 0;
       
        int length = 0;
        for(int j = 0 ; j<array.length; j++){
           if(ch.contains(array[j])){
               while(i<j && ch.contains(array[j])){
                   ch.remove(array[i]);
               i++;
               }
           }
           ch.add(array[j]);
           length = Math.max(length,j-i+1);
        }
    return length;
    }
}
