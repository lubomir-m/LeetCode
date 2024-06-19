class Solution {
    public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list = new ArrayList<>(numRows);
            List<Integer> one = new ArrayList<>(1);
            one.add(1);
            list.add(one);

            for (int i = 2; i <= numRows; i++) {
                List<Integer> prev = list.get(i - 2);
                List<Integer> current = new ArrayList<>(i);
                for (int j = 1; j <= i; j++) {
                    if (j == 1) {
                        current.add(prev.getFirst());
                    } else if (j == i) {
                        current.add(prev.getLast());
                    } else {
                        int num = prev.get(j - 2) + prev.get(j - 1);
                        current.add(num);
                    }
                }

                list.add(current);
            }
            
            return list;
        }
}