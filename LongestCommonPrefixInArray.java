class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        String str = arr[0];
        String result="";
        for(int k=1;k<n;k++){
           String wrd1 = str;
           String wrd2 = arr[k];
           result="";
        for(int i=0, j=0; i<wrd1.length() && j<wrd2.length(); i++, j++){
            if(wrd1.charAt(i)!=wrd2.charAt(j)) break;
            result += wrd1.charAt(i);
            }
            str = result;
        }
        return result;
    }
}
