class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int zero = 0;

        while (nums[zero] != 0) {
            zero++;
        }

        int ans = Integer.MAX_VALUE;

        // Case 1: Rotation only
        boolean normal = true;

        for (int j = 0; j < n; j++) {
            if (nums[(j + zero) % n] != j) {
                normal = false;
                break;
            }
        }

        if (normal) {
            ans = Math.min(ans, Math.min(zero, n - zero + 2));
        }

        // Case 2: Rotation and reversal
        int k = (zero + 1) % n;
        boolean reverse = true;

        for (int j = 0; j < n; j++) {
            int idx = (k - 1 - j + n) % n;

            if (nums[idx] != j) {
                reverse = false;
                break;
            }
        }

        if (reverse) {
            ans = Math.min(ans, Math.min(k, n - k) + 1);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}