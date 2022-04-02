class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        int s =0;
        while(start<=end)
        {
            mid = start + (end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                start = mid+1;
                s=mid+1;
            }
            else if(nums[mid]>target)
            {
                end = mid-1;
                s=mid;
            }
        }
        return s;
    }
}
