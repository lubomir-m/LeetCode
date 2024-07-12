class Solution {
      public int minSubArrayLen(int target, int[] nums) {
            int minLength = Integer.MAX_VALUE;
            int sum = 0;
            int i = 0;
            int j = 0;
            int lastI = -1;

            while (i < nums.length) {
                if (lastI < i) {
                    sum += nums[i];
                    lastI = i;
                }

                if (sum == target || sum > target) {
                    int length = i - j + 1;
                    if (length < minLength) {
                        minLength = length;
                    }
                    sum -= nums[j++];
                } else {
                    i++;
                }
            }

            if (minLength == Integer.MAX_VALUE) {
                return 0;
            } else {
                return minLength;
            }
        }
}