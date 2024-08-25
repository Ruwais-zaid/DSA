class Solution {
     public static void solve(int [] num,int index,List<List<Integer>> ls ,ArrayList<Integer> m){
       ls.add(new ArrayList<>(m));
        for(int i=index;i<num.length;i++){
            if(i>index && num[i]==num[i-1]) {
                continue;
            }
                m.add(num[i]);
                solve(num,i+1,ls,m);
                m.remove(m.size()-1);
            }

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ls= new ArrayList<>();
        ArrayList<Integer> m = new ArrayList<>();

        solve(nums,0,ls,m);
        return ls;
        
    }
}