class Solution {
    public String frequencySort(String s) {
        StringBuilder result = new StringBuilder();
        char arr[] = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(
                (a,b)->{
                     int freq = b.getValue().compareTo(a.getValue());
                     if(freq==0){
                         return Character.compare(a.getKey(),b.getKey());
                     }
                     return freq;
                }
        );

        pq.addAll(map.entrySet());
        System.out.println(pq);
        while(!pq.isEmpty()){
            int ans = pq.peek().getValue();
            for(int i=0;i<ans;i++){
                result.append(pq.peek().getKey());
            }
            pq.poll();

        }
        return result.toString();
        
    }
}