class Solution {
    public int dominantIndex(int[] nums) {
            int index = -1;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    index = i;
                }
            }

            for (int num : nums) {
                if (num != max && (max - (2 * num) < 0)) {
                    return -1;
                }
            }

            return index;
        }
}