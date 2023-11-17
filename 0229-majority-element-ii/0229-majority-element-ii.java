class Solution {
    public static boolean checkelem1(int[] arr,int val1){
        int counter=0;
        for(int i=0;i<arr.length;i++){
                if(arr[i]==val1){
                    counter+=1;
                }
            }
            if(counter>arr.length/3){
                return true;

            }
        else{
            return false;
        }
    }
    public List<Integer> majorityElement(int[] nums) {
        int[] arr=nums;
        int val1=arr[0];
        int count1=1;
        int val2=arr[0];   //choose any ellemnt
        int count2=0;
        int i=1;
        while(i<nums.length){
            if(arr[i]==val1){
                count1++;
            }
            else if (arr[i]==val2){
                count2++;
            }
            else{
                if(count1==0){
                    val1=arr[i];
                    count1=1;
                    
                }
                else if(count2==0){
                    val2=arr[i];
                    count2=1;
                    
                }
                else{
                    count1--;
                    count2--;
                    
                }
            
            }
            i++;
        }
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(checkelem1(arr,val1)){
            ans.add(val1);
            
        }
        if(val1!=val2 && checkelem1(arr,val2)){
            ans.add(val2);
        }
        return ans;
        
    }
}