class Solution {
    public String reverseWords(String s) {
    
    String[] words = s.trim().split("\\s+");
        String s2 = "";
        
        for (int i = words.length - 1; i >= 0; i--) {
            s2 += words[i];  
            if (i > 0) s2 += " ";
        }
        
        return s2;
    
    }
}
