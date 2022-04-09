public class practice {
    public static void ConvertNumberToAlphabet(int num ,String[] s)
    {
        if(num==0)
        {
            return;
        }
        int temp = num%10;
        ConvertNumberToAlphabet(num/10,s);
        System.out.println(s[temp]);
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the number: ");
        int num = sc.nextInt();
        String[] s = new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        ConvertNumberToAlphabet(num,s);
    }
}
