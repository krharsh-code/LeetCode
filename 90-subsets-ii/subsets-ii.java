class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     List<List<Integer>>ans=new ArrayList<>();
     Arrays.sort(nums);
     subset(nums,0,ans,new ArrayList<>());
     return ans; 
    }
    public void subset(int[] nums,int idx,List<List<Integer>>ans,List<Integer> temp){
        if(idx==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        temp.add(nums[idx]);
        subset(nums,idx+1,ans,temp);
        temp.remove(temp.size()-1);
        
      int n=idx+1;
       while(n<nums.length && nums[n]==nums[n-1]) n++;

       subset(nums,n,ans,temp);
   }
}