class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] array = new int[2];
        int low = 0;
        int high = numbers.length-1;
        while(low<high){
            if(numbers[low]+numbers[high] == target){
                array[0] = ++low;
                array[1] = ++high;
                return array;
            }
            else if(numbers[low]+numbers[high]>target) high--;
            else low++;
        }
        return array;
    }
}
