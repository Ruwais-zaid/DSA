class Solution {
    public String kthDistinct(String[] arr, int k) {
        String ans ="";
        List<String> order = new ArrayList<>();
        int freq[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            String ch =arr[i];
            int index = order.indexOf(ch);
            if(index==-1){
                order.add(ch);
                freq[order.size()-1]=1;
            }
            else{
                freq[index]+=1;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1 && k>0){
                k--;
                ans = order.get(i);
            }
        }
        if(k>0){
            ans="";
        }
        return ans;
        
    }
}