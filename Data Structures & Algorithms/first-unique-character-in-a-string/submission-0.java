public class Solution {
    public int firstUniqChar(String s) {
        int res = s.length();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int firstIndex = s.indexOf(ch);
            if (firstIndex != -1 && s.lastIndexOf(ch) == firstIndex) {
                res = Math.min(res, firstIndex);
            }
        }

        return res == s.length() ? -1 : res;
    }
}