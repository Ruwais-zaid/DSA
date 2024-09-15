class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        int arr[]=nums;
        int n=arr.length;
        int arr1[]=new int[n];
        int arr2[]= new int[n];
        ArrayList<Integer> ans= new ArrayList<>();
        if(arr.length>=1){
            for(int i=0;i<arr.length;i++){
                    if(i==0){
                        arr1[i]=1;
                    }
                   else if(arr[i-1]>=arr[i]){
                        arr1[i]=arr1[i-1]+1;

                    }
                    else{
                        arr1[i]=1;
                    }

            }
            for(int i=arr.length-1;i>=0;i--){
                if(i==arr.length-1){
                    arr2[i]=1;
                }
                else if(arr[i+1]>=arr[i]){
                    arr2[i]=arr2[i+1]+1;
                }
                else{
                    arr2[i]=1;
                }
            }

            for(int i=0;i<arr.length;i++){
                if(i>=k && i<n-k){
                    if(arr1[i-1]>=k && arr2[i+1]>=k){
                        ans.add(i);

                    }

                }
            }
        }
        return ans;
       
        
    }
}