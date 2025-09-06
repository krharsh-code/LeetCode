class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;//2 2 2 4 4 4 5 6 6 6
        Arrays.sort(nums); 
     for(int i=1;i<n;i+=3)
     {
        if(nums[i]!=nums[i-1]){
            return nums[i-1];
        }
        
     }
     return nums[n-1];
    }
} 