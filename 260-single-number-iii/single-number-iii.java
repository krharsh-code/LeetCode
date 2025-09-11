class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        int n=nums.length;
        int rightMost;
        for(int i=0;i<n;i++){
            xor=xor^nums[i];
           
        }
         rightMost=(xor & -xor);
        int b1=0,b2=0;
        for(int i=0;i<n;i++){
        if((nums[i] & rightMost)==0){
            b1^=nums[i];
        }
        else{
            b2^=nums[i];
        }
        }
        return new int[]{b2,b1};
    }
}