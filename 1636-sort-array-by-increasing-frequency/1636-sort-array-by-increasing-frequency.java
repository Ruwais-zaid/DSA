class Solution {
    public int[] frequencySort(int[] nums) {
      
        int arr1[] = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> {
                    int freqCompare = a.getValue().compareTo(b.getValue());
                    if (freqCompare == 0) {

                        return b.getKey().compareTo(a.getKey());
                    }
                    return freqCompare;
                }
        );
        pq.addAll(map.entrySet());
        System.out.println(pq);
        int index=0;
        while(!pq.isEmpty()){
            int number = pq.peek().getKey();
            int freq = pq.peek().getValue();
            for(int i=0;i<freq;i++){
                arr1[index++]=number;

            }
            pq.poll();
        }
        return arr1;

        
    }
}