class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int arr[]=tickets;
       int time=0;
       int i=0;
       while(arr[k]!=0){
           if(i==arr.length && arr[k]!=0){
               i=0;
           }
           if(arr[i]!=0){

               arr[i]=arr[i]-1;
               time+=1;

           }
           i++;
       }
        return time;
        
    }
}