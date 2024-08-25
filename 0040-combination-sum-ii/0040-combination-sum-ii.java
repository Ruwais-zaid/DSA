class Solution {
     public static void solve(int arr[],int target,int index,List<List<Integer>> ls ,ArrayList<Integer> m){
        if(target==0){
            ls.add(new ArrayList<>(m));
            return;
        }

        if(target<0 || index>=arr.length){
            return;

        }

        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]){
                continue;
            }
            m.add(arr[i]);
            solve(arr,target-arr[i],i+1,ls,m);
            m.remove(m.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        int arr[]= candidates;
        Arrays.sort(arr);

        List<List<Integer>> ls = new ArrayList<>();
        ArrayList<Integer> m = new ArrayList<>();
        solve(arr,target,0,ls,m);
        return ls;
    }
}