class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Map<Integer,int[]> map = new TreeMap<Integer,int[]>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            map.put(score[i][k],score[i]);
        }
        int index = 0;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            score[index++] = entry.getValue();
        }
        return score;
    }
}