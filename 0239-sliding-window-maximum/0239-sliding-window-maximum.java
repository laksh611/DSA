class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        int l = 0;
        int r = 0;
        int index = 0;

        while (r < n) {

            // Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[r]) {
                dq.pollLast();
            }

            // Add current index
            dq.addLast(r);

            // Remove element outside window
            if (dq.peekFirst() < l) {
                dq.pollFirst();
            }

            // Window size becomes k
            if (r - l + 1 == k) {

                // Front contains maximum
                ans[index] = nums[dq.peekFirst()];
                index++;

                // Move left
                l++;
            }

            // Move right
            r++;
        }

        return ans;
    }
}