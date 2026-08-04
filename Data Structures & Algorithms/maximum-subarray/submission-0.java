class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxi = nums[0];
        int curr = nums[0];
        for(int i = 1 ;i < nums.length ;i++){
            curr = Math.max(nums[i],nums[i]+curr);
            maxi = Math.max(curr,maxi);
        }
        return maxi;
    }
}
