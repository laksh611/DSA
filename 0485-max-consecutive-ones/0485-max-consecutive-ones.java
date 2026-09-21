class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        int i=0;
        int j=0;

        while(j<nums.length){
            if(nums[j]!=1){
                count=0;
                
                j++;
                i=j;


            }
            else{
                
                count++;
                max=Math.max(max,count);
                j++;
            }
        }

        return max;
        
    }
}
