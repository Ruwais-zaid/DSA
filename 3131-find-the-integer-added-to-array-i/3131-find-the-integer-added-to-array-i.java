class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1=0,sum2=0,ans=0;
        if(nums1.length==1) {
            if (nums1[0] > nums2[0]) {
                ans=nums2[0]-nums1[0];
            } else {
                ans=nums2[0]-nums1[0];

            }

            return ans;

        }
        else{
            for(int i=0;i<nums1.length;i++){
                    sum1+=nums1[i];
                    sum2+=nums2[i];
                }
            if(sum1>sum2){
                sum1=sum2-sum1;
                ans=sum1/nums1.length;
            }
            else{
                sum1=sum2-sum1;
                ans=sum1/ nums1.length;
            }
           return ans;

    }
        
    }
}