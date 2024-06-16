class Solution {
    public int[] plusOne(int[] digits) {
            boolean increase = false;
            if (digits[digits.length - 1] < 9) {
                digits[digits.length - 1] += 1;
                return digits;
            } else {
                digits[digits.length - 1] = 0;
                increase = true;
            }

            if (digits.length == 1) {
                int[] result = new int[2];
                result[0] = 1;
                return result;
            }
            
            
            List<Integer> list = new ArrayList<>();
            list.add(digits[digits.length - 1]);

            for (int i = digits.length - 2; i >= 0; i--) {
                if (increase) {
                    digits[i] += 1;
                    if (digits[i] == 10) {
                        digits[i] = 0;
                    } else {
                        increase = false;
                    }
                }

                list.add(digits[i]);
                if (i == 0 && digits[i] == 0) {
                    list.add(1);
                }
            }

            return list.reversed().stream().mapToInt(Integer::intValue).toArray();
        }
}