class Solution {
     public int findMaxConsecutiveOnes(int[] nums) {
            if (nums.length == 1) {
                return 1;
            }

            List<Integer> zeroIndexes = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    zeroIndexes.add(i);
                }
            }
            
            if (zeroIndexes.isEmpty()) {
                return  nums.length;
            }

            int max = 0;
            for (int zeroIndex : zeroIndexes) {
                nums[zeroIndex] = 1;
                int count = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == 1) {
                        count++;
                        if (max < count) {
                            max = count;
                        }
                    } else {
                        count = 0;
                    }
                }

                nums[zeroIndex] = 0;
            }

            return max;
        }
}