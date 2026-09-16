class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int rightmax=height[r];
        int leftmax=height[l];
        int water=0;

        while(l<r){
            if(height[l]<height[r]){
                l++;
                leftmax=Math.max(leftmax,height[l]);
                water+=leftmax-height[l];
                

            }
            else{
                r--;
                rightmax=Math.max(rightmax,height[r]);
                water+=rightmax-height[r];
            }
        }
        return water;

        
    }
}