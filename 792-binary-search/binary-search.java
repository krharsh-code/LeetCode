class Solution {
    public int search(int[] nums, int target) {
        return binary(nums,target,0,nums.length-1);
    }
    public int binary(int[] arr,int k,int l,int r){

        if(l>r){
            return -1;
        }

        int mid=l+(r-l)/2;
        if(arr[mid]==k) return mid;
        if(arr[mid]<=k) return binary(arr,k,mid+1,r);
        return binary(arr,k,l,mid-1);
    }
}