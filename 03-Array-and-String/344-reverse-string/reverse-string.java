class Solution {
    public void reverseString(char[] s) {
            int i = 0;
            int size = s.length - 1;

            while (i < size - i) {
                char temp = s[i];
                s[i] = s[size - i];
                s[size - i] = temp;
                i++;
            }
        }
}