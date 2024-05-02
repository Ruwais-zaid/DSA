class Solution {
    public int countElements(int[] nums) {
        int min = nums[0]; // Initialize min to the first element of the array
        int max = nums[0]; // Initialize max to the first element of the array
        int count=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i]; // Update max if the current element is greater than the current max
            } else if (nums[i] < min) {
                min = nums[i]; // Update min if the current element is smaller than the current min
            }
        }

        for(int i=0;i< nums.length;i++){
            if(nums[i]>min && nums[i]<max){
                count++;
            }

        }
        return count;
}
}