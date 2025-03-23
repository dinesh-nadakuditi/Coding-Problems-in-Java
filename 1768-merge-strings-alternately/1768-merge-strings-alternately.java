class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        char[] combined = new char[n + m]; 
        int index = 0;

        for (int i = 0; i < Math.max(n, m); i++) {
            if (i < n) combined[index++] = word1.charAt(i);
            if (i < m) combined[index++] = word2.charAt(i);
        }

        return new String(combined);
    }
}
