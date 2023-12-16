class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        Stack<int[]> stk=new Stack<>();
        stk.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            int[] poparray=stk.pop();
            int start1=poparray[0];
            int end1=poparray[1];
            int maxi=Math.max(end1,end2);
            if(end1>=start2){
                int[] merge=new int[]{start1,maxi};
                stk.add(merge);
                
            }
            else{
                stk.add(poparray);
                stk.add(intervals[i]);
            }
        }
        int[][] out=new int[stk.size()][2];
        for(int i=out.length-1;i>=0;i--){
            int[] pop1=stk.pop();
            out[i][0]=pop1[0];
            out[i][1]=pop1[1];
        }
        return out;
        
    }
}