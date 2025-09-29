class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low =0;
        int high=n-1;
        while(low<=high){
            int mid= low + (high-low)/2 ;//high-low esliye kiya kiuki if values are bigger then it will give neagative value.
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else 
            {
                high= mid-1;
            }
        }
        return low;    }
}