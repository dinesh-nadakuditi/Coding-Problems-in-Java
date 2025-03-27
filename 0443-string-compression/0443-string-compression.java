class Solution {
    public int compress(char[] chars) {
        int index = 0, i = 0;
        
        while (i < chars.length) {
            char ch = chars[i];
            int count = 0;
            
            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }
            
            chars[index++] = ch;
            
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        
        return index;
    }
}
