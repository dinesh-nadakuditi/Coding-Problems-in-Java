class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int close = nums[0]+nums[1]+nums[2];
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            int left = i+1,right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];

                if(Math.abs(target-sum) < Math.abs(target-close)){
                    close = sum;
                }
                if(sum < target){
                    left++;
                }else if(sum > target){
                    right--;
                }else{
                    return sum;
                }
            }
        }
        return close;
    }
    
}