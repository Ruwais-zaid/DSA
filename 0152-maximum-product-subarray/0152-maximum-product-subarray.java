class Solution {
    public int maxProduct(int[] nums) {
        int[] arr=nums;
        int ans=Integer.MIN_VALUE;
        int prefix=1;
        int suffix=1;
        for(int i=0;i<arr.length;i++){
            if(prefix==0){
                prefix=1;
            }
            prefix=arr[i]*prefix;
            ans=Math.max(prefix,ans);

        }
        for(int i=arr.length-1;i>=0;i--){
            if(suffix==0){
                suffix=1;
            }
            suffix=arr[i]*suffix;
            ans=Math.max(suffix,ans);
        }
        return ans;
        
    }
}