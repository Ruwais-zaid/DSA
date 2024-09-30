class Solution {
    public int romanToInt(String s) {
        String str= s;
        HashMap<String, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put("I", 1);
        romanNumerals.put("IV", 4);
        romanNumerals.put("V", 5);
         romanNumerals.put("IX", 9);
        romanNumerals.put("X", 10);
        romanNumerals.put("XL", 40);
        romanNumerals.put("L", 50);
        romanNumerals.put("XC", 90);
        romanNumerals.put("C", 100);
        romanNumerals.put("CD", 400);
        romanNumerals.put("D", 500);
        romanNumerals.put("CM", 900);
        romanNumerals.put("M", 1000);

        char[] str1 = str.toCharArray();
        int ans = 0;
        int i = 0;

        while (i < str1.length) {
           
            String currentChar = Character.toString(str1[i]);

        
            if (i + 1 < str1.length) {
                String nextChar = Character.toString(str1[i + 1]);
                String combined = currentChar + nextChar;

               
                if (romanNumerals.containsKey(combined)) {
                    ans += romanNumerals.get(combined); 
                    i += 2; 
                    continue;
                }
            }

            ans += romanNumerals.get(currentChar);
            i++;
        }

        return ans;
    }
}
