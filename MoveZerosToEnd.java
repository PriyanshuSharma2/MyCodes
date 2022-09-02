class Solution {
    public void moveZeroes(int[] nums) {
        int lastzero = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                lastzero++;
                int temp = nums[lastzero];
                 nums[lastzero] = nums[i];
                nums[i]=temp;
            }
        }
        
    }
}
