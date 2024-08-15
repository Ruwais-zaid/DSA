class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        String ans[] = new String[names.length];
        Map<Integer,String> map = new TreeMap<>(Collections.reverseOrder());
        int size=names.length;
        for(int i=0;i<size;i++){
            map.put(heights[i],names[i]);
        }
        int index=0;
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            ans[index++]=entry.getValue();
        }
        return ans;
    }
}