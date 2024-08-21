class Solution {
    
    public static int solve(List<List<Integer>> l , int i ,int j,List<List<Integer>> dp){
        if(i==l.size()-1){
            return l.get(l.size()-1).get(j);
        }
        
        
     if(dp.get(i).get(j)!=-1){
         return dp.get(i).get(j);
     }
        int up = solve(l,i+1,j,dp)+l.get(i).get(j);
        int downdiag= solve(l,i+1,j+1,dp)+l.get(i).get(j);
       dp.get(i).set(j,Math.min(up,downdiag));
        return dp.get(i).get(j);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int row = triangle.size();
        int col = triangle.get(0).size();
        
        
       List<List<Integer>> dp = new ArrayList<>();
for (int i = 0; i < row; i++) {
    dp.add(new ArrayList<>(Collections.nCopies(triangle.get(i).size(), -1)));
}

        
        return solve(triangle,0,0,dp);
        
    }
}