class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0, i = s.length() - 1;

       
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLastWord("Hello World")); 
    }
}
