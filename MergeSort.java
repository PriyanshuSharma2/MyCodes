public class practice {
    public static void merge(int[] arr,int start, int end, int mid)
    {
        int[] temp = new int[end-start+1];
        int index1 = start;
        int index2 = mid+1;
        int i = 0;
        while(index1<=mid && index2<=end) {
            if (arr[index1] > arr[index2]) {
                temp[i] = arr[index1];
                i++;
                index1++;
            } else {
                temp[i] = arr[index2];
                i++;
                index2++;
            }
        }
            while(index1<=mid)
            {
                temp[i] = arr[index1];
                i++; index1++;
            }
            while(index2<=end)
            {
                temp[i] = arr[index2];
                i++; index2++;
            }
            for (int j = 0, k=start; j < temp.length; j++,k++) {
                 arr[k] = temp[j];
            }
        }
    public static void sort(int[] arr,int start ,int end)
    {
        if(start>=end)
        {
            return;
        }
        int mid  = start + (end-start)/2;
        sort(arr,start,mid);
        sort(arr,mid+1,end);
        merge(arr,start,end,mid);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size  =sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array");
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
