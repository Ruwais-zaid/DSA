class Solution {
    public static int solveBinarySearch(int nums[],int n){
        List<Integer> ans=new ArrayList<>();
        ans.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i]> ans.get(ans.size()-1)){
                ans.add(nums[i]);
             }
            else{
                //find the index of just bad eleemnt aur nums[i] element ko usme et karege
                int low= Collections.binarySearch(ans,nums[i]);
                if(low<0){
                    low=-(low+1);

                }
                ans.set(low,nums[i]);
            }
        }
        return ans.size();


    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
       
        int ans=solveBinarySearch(nums,n);
        return ans;
        
    }
}