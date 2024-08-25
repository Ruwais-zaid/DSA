class Solution {
     public static void solve(int arr[],int index,int target,List<List<Integer>> ls,ArrayList<Integer> m){
        if(target==0){

            ls.add(new ArrayList<>(m));
            return;

        }

        if(index<0 || target<0){
            return;
        }

        //include
    
            m.add(arr[index]);
            solve(arr,index,target-arr[index],ls,m);
            m.remove(m.size()-1);
            solve(arr,index-1,target,ls,m);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n= candidates.length;
        
        List<List<Integer>> ls= new ArrayList<>();
        ArrayList<Integer> m = new ArrayList<>();
        solve(candidates,n-1,target,ls,m);
        return ls;
    }
}