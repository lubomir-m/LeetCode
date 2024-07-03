class Solution {
    public int[] twoSum(int[] numbers, int target) {
            int first = -1;
            int second = -1;
            for (int i = 0; i < numbers.length; i++) {
                boolean flag = false;
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] + numbers[j] == target) {
                        first = i + 1;
                        second = j + 1;
                        flag = true;
                        break;
                    }
                }
                
                if (flag) {
                    break;
                }
            }
            
            return new int[]{first, second};
        }
}