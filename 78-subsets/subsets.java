class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Subsets(nums, 0, ans,new ArrayList<>());
        return ans; 
    }
 public void Subsets(int[] nums, int idx, List<List<Integer>> ans, List<Integer> temp) {
    if(idx==nums.length){
        ans.add(new ArrayList<>(temp));
        return;
    }
    Subsets(nums,idx+1,ans,temp);
    temp.add(nums[idx]);
    Subsets(nums,idx+1,ans,temp);
    temp.remove(temp.size()-1);
    
 }
}