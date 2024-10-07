class Solution {
     private static boolean hasRemainingFrequency(Map<Character, Integer> frequencyMap) {
        for (int frequency : frequencyMap.values()) {
            if (frequency > 0) {
                return true;
            }
        }
        return false;
    }
    public String sortString(String s) {
        	String result = "";
		HashMap<Character,Integer> map = new HashMap<>();
		char arr[] = s.toCharArray();
		for(int i=0;i<arr.length;i++){
		    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		  while (hasRemainingFrequency(map)) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (map.getOrDefault(ch, 0) > 0) {
                    result+=ch;
                    map.put(ch, map.get(ch) - 1);
                }
            }

            for (char ch = 'z'; ch >= 'a'; ch--) {
                if (map.getOrDefault(ch, 0) > 0) {
                    result+=ch;
                    map.put(ch, map.get(ch) - 1);
                }
            }
        }
        return result.toString();
       
    }
        
    
}