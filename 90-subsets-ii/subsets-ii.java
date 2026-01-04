class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     List<List<Integer>>ans=new ArrayList<>();
     Arrays.sort(nums);
     subset(nums,0,ans,new ArrayList<>());
     return ans; 
    }
    public void subset(int[] nums,int idx,List<List<Integer>>ans,List<Integer> temp){
    ans.add(new ArrayList<>(temp));

    for(int i=idx;i<nums.length;i++){
        if(i>idx && nums[i]== nums[i-1]) continue;

        temp.add(nums[i]);
        subset(nums,i+1,ans,temp);
        temp.remove(temp.size()-1);
    }
   }
}