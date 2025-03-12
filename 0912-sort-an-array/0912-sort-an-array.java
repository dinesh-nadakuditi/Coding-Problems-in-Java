class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        if(n==1)
        return nums;
        for(int i = n/2-1;i>=0;i--){
            heap(nums,n,i);
        }
        for(int i=n-1;i>=0;i--){
            int temp = nums[0];
            nums[0]=nums[i];
            nums[i]=temp;
            heap(nums,i,0);
        }
        return nums;
    }
    private void heap(int arr[],int n,int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest = right;
        }
        if(largest!=i){
            int temp = arr[i];
            arr[i]= arr[largest];
            arr[largest]=temp;
            heap(arr,n,largest);
        }
    }
}