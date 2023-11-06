class Solution {
     void heapsort(int arr[]){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>0;i--){
            int temp;
            temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            //call
            heapify(arr,i,0);
        }
    }
    void heapify(int[] arr,int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && arr[largest]<arr[left]){
            largest=left;
        }
        if(right<n && arr[largest]<arr[right]){
            largest=right;
        }
        if(largest!=i){
            //swap
            int temp;
            temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            //call for subtree
            heapify(arr,n,largest);
        }
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        heapsort(nums);
        return nums;
        
    }
}