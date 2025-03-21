class Solution {
    public boolean isPalindrome(int x) {
       String og = String.valueOf(x);
       String rev = new StringBuilder(og).reverse().toString();
       return og.equals(rev);
    }
}
