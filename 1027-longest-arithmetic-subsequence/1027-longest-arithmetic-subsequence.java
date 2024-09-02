class Solution {
    public static int solve(int index,int diff,int arr[],HashMap<Integer,HashMap<Integer,Integer>> dp){
        if(index<0){
            return 0;
        }
        if(dp.containsKey(index) && dp.get(index).containsKey(diff)) {
            return dp.get(index).get(diff);
        }
        int ans=0;
        for(int i=index-1;i>=0;i--){
            if(arr[index]-arr[i]==diff){
                ans=Math.max(ans,1+solve(i,diff,arr,dp));
            }
        }
        dp.putIfAbsent(index,new HashMap<>());
        dp.get(index).put(diff,ans);
        return ans;
    }
    public int longestArithSeqLength(int[] nums) {
        int n= nums.length;
        HashMap<Integer,HashMap<Integer,Integer>> dp= new HashMap<>(n+1);
        int ans =0;
        if(n<=2){
            return n;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ans=Math.max(ans,2+solve(i,nums[j]-nums[i],nums,dp));

            }
        }
        return ans;
        
    }
}