class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false;
        int i = Integer.MAX_VALUE;
        int j = i;

        for(int n : nums){
            if(n <=  i){
                i = n;
            }else if( n <= j){
                j=n;
            }else{
                return true;
            }
        }

        
        return false;
    }
}