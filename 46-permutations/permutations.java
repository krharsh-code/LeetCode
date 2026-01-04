class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        permu(nums,ans,new ArrayList<>(),new boolean[nums.length]);
        return ans;
    }
    public void permu(int[] nums,List<List<Integer>>ans,List<Integer>temp,boolean[] visted){
        if(nums.length==temp.size()){
            ans.add(new ArrayList<>(temp));
        }
        for(int i=0;i<nums.length;i++){
            if(visted[i]==false){
                visted[i]=true;
                temp.add(nums[i]);
                permu(nums,ans,temp,visted);
                visted[i]=false;
                temp.remove(temp.size()-1);
            } 
        }
    }
}