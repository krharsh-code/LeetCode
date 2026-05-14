class Solution {
    public int maxArea(int[] height) {
     int l=0;
     int r=height.length-1;
     int minArea=0;
     int max=0;
     for(int i=0;i<height.length;i++){
       minArea=Math.min(height[l],height[r]) *(r-l);

       max=Math.max(max,minArea);

       if(height[l]<height[r]){
        l++;
       }else{
        r--;
       }
     }   
     return max;
    }
}