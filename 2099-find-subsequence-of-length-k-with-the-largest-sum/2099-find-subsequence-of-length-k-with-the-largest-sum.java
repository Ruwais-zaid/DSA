class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int arr[] = nums;
        int n= nums.length;
         int arr1[] = new int [k];
        
       
        int neworig[][] = new int[n][2];
      
        for (int i = 0; i < n; i++) {
            neworig[i][0] = arr[i]; 
            neworig[i][1] = i;      
        }
        
        // Sort the 2D array in descending order based on the values (first column)
        Arrays.sort(neworig, (a, b) -> Integer.compare(b[0], a[0]));

        // Extract sorted values and their original indices
        int sortedvalue[] = new int[n];
        int sortedorig[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            sortedvalue[i] = neworig[i][0];
            sortedorig[i] = neworig[i][1]; 
        }
        
 
        
        int i=0;
        while(i<k){
            arr1[i]=sortedorig[i];
            i++;
        }
    Arrays.sort(arr1);
    for(int j=0;j<arr1.length;j++){
        arr1[j] = arr[arr1[j]];
    }
       

        return arr1;
        
    }
}