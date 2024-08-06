import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        int count = 0;

        // Count occurrences in words1
        for (String word : words1) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }

        // Count occurrences in words2
        for (String word : words2) {
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }

        // Count words that appear exactly once in both maps
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String word = entry.getKey();
            int freq1 = entry.getValue();
            if (freq1 == 1 && map2.containsKey(word) && map2.get(word) == 1) {
                count++;
            }
        }

        return count;
    }
}
