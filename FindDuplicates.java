class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        Arrays.sort(arr);
        int nums = arr[0];
        for(int i = 1 ;i<arr.length;i++){
            if(arr[i]==nums){
                if(!Arr.contains(nums)){
                    Arr.add(nums);
                }
            }
            else{
                nums = arr[i];
            }
        }if(Arr.size() == 0) Arr.add(-1);
        return Arr;
    }
}
