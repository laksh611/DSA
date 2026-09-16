class Solution {
    public int maxArea(int[] height) {
        int r=height.length-1;
        int l=0;
        int maxa=0;
        while(r>l){
            int h=Math.min(height[l],height[r]);
            int w=r-l;
            int area=h*w;
            maxa=Math.max(area,maxa);
            if(height[r]>height[l]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxa;

        
    }
}