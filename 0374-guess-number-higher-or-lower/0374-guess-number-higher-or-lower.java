/** 
 * Forward declaration of guess API.
 * @param num your guess
 * @return -1 if num is higher, 1 if num is lower, 0 if num is correct
 */
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; 
            
            
            int result = guess(mid);
            
            if (result == 0) {
                return mid; 
            } else if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return -1; 
    }
}
