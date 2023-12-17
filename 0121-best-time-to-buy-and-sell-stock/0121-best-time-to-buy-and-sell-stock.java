class Solution {
    public int maxProfit(int[] prices) {
        int arr[]=prices;
        int ans=Integer.MIN_VALUE;
        int curr = arr[0],mini=arr[0];


        for(int i=1;i<arr.length;i++){
            if(arr[i]<curr){
                curr=arr[i];
                mini=Math.min(mini,curr);
            }
            else{
                curr=arr[i];
                mini=Math.min(mini,curr);
            }
            ans=Math.max(curr-mini,ans);
        }
        if(arr.length==1){
            return curr-mini;
        }
        else{
            return ans;
        }

    }
}