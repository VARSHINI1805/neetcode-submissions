class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length *2];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
        }
        int k=0;
        for(int i=nums.length;i<nums.length *2 ; i++){
            res[i] = nums[k];
            k++;
        }
        return res;
    }
}