class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double max = (double) sum / k;

        int l = 0;
        int h = k;

        while (h < nums.length) {
            
            sum = sum - nums[l] + nums[h];

            double avg = (double) sum / k;

            max = Math.max(max, avg);

            l++;
            h++;
        }

        return max;
    }
}