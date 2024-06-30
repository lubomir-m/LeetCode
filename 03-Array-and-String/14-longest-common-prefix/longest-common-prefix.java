class Solution {
    public String longestCommonPrefix(String[] strs) {
            int count = 0;
            for (int i = 0; i < strs[0].length(); i++) {
                String search = strs[0].substring(0, i + 1);
                boolean flag = true;
                for (int j = 1; j < strs.length; j++) {
                    if (!strs[j].startsWith(search)) {
                        flag = false;
                        break;
                    }
                }
                
                if (flag) {
                    count = i + 1;
                } else {
                    break;
                }
            }

            return strs[0].substring(0, count);
        }
}