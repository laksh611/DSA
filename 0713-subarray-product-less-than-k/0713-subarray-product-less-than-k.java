class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int l=0;int r=0;
        int pr=1;
        if (k <= 1) {
    return 0;
}
        while(r<nums.length){
            pr=pr*nums[r];

            while(pr>=k){
                pr/=nums[l];
                l++;
            }
            count+=r-l+1;
            r++;

        }return count;
        
    }
}