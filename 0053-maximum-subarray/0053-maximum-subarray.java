class Solution {
    public int maxSubArray(int[] nums) {
        //HERE I USE KADANE ALGORITHIM 
        //TIME COMPLEXITY:O(N);
        //SPACE : O(1);
        int curr_sum=0;
        int best_sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curr_sum=Math.max(nums[i],curr_sum+nums[i]);
            best_sum=Math.max(best_sum,curr_sum);
        }
        return best_sum;
    }
}