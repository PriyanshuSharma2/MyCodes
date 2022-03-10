package String;

public class BubbleSortString {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazzy dog";
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j <str.length-1-i ; j++) {
                if(str[j].length()>str[j+1].length())
                {
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
                else if(str[j].length()==str[j+1].length() && str[j].compareTo(str[j+1])>0)
                {
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
}
