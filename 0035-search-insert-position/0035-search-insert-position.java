class Solution {
    public int searchInsert(int[] nums, int target) {
        int arr[]= nums;
        int ans=Integer.MIN_VALUE;
		int low =0;
		int high = arr.length-1;
		 int mid = low+(high-low)/2;
		while(low<=high){
		    if(arr[mid]==target){
		        ans=mid;
		        break;
		    }
		 
		    else if(arr[mid]<target){
		        low=mid+1;
                ans=mid+1;
		        
		        
		    }
		    else{
		        high=mid-1;
                ans=mid;
		    }
		    mid = low+(high-low)/2;
		}
        return ans;
    }
}