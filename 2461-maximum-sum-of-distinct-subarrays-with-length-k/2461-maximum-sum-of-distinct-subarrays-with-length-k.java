class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        

        HashSet<Integer> set = new HashSet<>();

        long sum = 0;
        long max = 0;
        int i = 0;
        int j = 0;

       while(j<nums.length){
        while(set.contains(nums[j])){
            sum-=nums[i];
            set.remove(nums[i]);
            i++;

        }
        sum+=nums[j];
       set.add(nums[j]);

       if(j-i+1==k){
        max=Math.max(max,sum);

        sum-=nums[i];
        set.remove(nums[i]);
        i++;
       }
       j++;
       }
       
        

        return max;
        
    }
}