class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int low=0;
        int min=Integer.MAX_VALUE;
        int elem=nums[low];
         for(int i=0;i<nums.length;i++){
             if(nums[i]<min){
                 min=nums[i];
                 
             }
         }
        
        for(int i=0;i<nums.length;i++){
            ans+=Math.abs(min-nums[i]);
        }
        return ans;
    }
}