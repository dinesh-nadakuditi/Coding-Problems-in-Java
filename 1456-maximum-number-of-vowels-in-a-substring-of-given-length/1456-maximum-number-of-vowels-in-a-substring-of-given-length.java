class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int maxVowelCount = 0, currentVowelCount = 0;

        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentVowelCount++;
            }
        }

        maxVowelCount = currentVowelCount;

        for (int i = k; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i - k)) != -1) {
                currentVowelCount--;
            }
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentVowelCount++;
            }
            maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
        }

        return maxVowelCount;
    }
}
