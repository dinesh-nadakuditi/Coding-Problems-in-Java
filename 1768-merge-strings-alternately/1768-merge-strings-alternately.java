class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int i=0,j=0;
        StringBuilder combined = new StringBuilder();

        while( i < word1.length() || j< word2.length()){
            if(i < word1.length()) combined.append(word1.charAt(i++));
            if(j < word2.length()) combined.append(word2.charAt(j++));
        }
        return combined.toString();
    }
}