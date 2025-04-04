class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[2001];
        for (int num : arr) {
            count[num + 1000]++;
        }

        boolean[] freq = new boolean[1001];
        for (int c : count) {
            if (c > 0) {
                if (freq[c]) return false;
                freq[c] = true;
            }
        }
        return true;
    }
}