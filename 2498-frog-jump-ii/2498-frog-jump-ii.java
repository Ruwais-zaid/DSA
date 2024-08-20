class Solution {
    public int maxJump(int[] stones) {
        int n = stones.length;
        
        if(n<=2){
            return stones[n-1]-stones[0];
            
        }
        int min = Integer.MIN_VALUE;
        for(int i=2;i<n;i++){
            min= Math.max(min,stones[i]-stones[i-2]);
            
        }
        return min;
    }
}