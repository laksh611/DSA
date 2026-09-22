class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=0;
        int max=0;
        int zer=0;
        while(r<n){
            if(nums[r]==0){
                zer++;
            }
            while(zer>k){
                if(nums[l]==0){
                    zer--;
                    

                }
                l++;
            }
            if(zer<=k){
                int len=r-l+1;
                max=Math.max(max,len);

            }
            r++;
        }
        return max;
    }
}