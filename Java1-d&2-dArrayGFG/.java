class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        // Complete the function
        ArrayList<Integer> Arr = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<a.length; i++)
        {
            if(b[i]>max)
            {
                max = b[i];
            }
            for(int j = 0 ; j<a.length; j ++)
            {
                if(i==j)
                {
                    sum += a[i][j];
                }
            }
        }
        Arr.add(sum);
        Arr.add(max);
        return Arr;
    }
}
