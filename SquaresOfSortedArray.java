class Solution {
    public int[] sortedSquares(int[] nums) {
        int start_indx = 0;
        int end_indx = nums.length-1;
        int[] new_array = new int[nums.length];
        int index = nums.length-1;
        
            while(start_indx<=end_indx){
                if(nums[start_indx]*nums[start_indx]>nums[end_indx]*nums[end_indx]){
                    new_array[index--] = nums[start_indx]*nums[start_indx];
                    start_indx++;
                }
                else{
                    new_array[index--] = nums[end_indx]*nums[end_indx];
                    end_indx--;
                }
            }
        return new_array;
    }
}
