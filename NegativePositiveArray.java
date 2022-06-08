public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int right = arr.length-1;
        int left = 0;
        int temp = 0;
        while(left<=right)
        {
            if(arr[right]<0 && arr[left]<0)
            {
                left++;
            }
            else if(arr[left]>0 && arr[right]<0)
            {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(arr[right]>=0 && arr[left]>=0)
            {
                right--;
            }
            else
            {
                right--;
                left++;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
