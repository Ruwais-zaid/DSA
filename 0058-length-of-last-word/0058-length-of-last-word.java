class Solution {
    public int lengthOfLastWord(String s) {
        ArrayList<String> arr = new ArrayList<>();

        // The input string

        // Split the input string by space
        String[] arrofstr = s.split(" ");

        // Iterate through the array of strings obtained after splitting
        for (String x : arrofstr) {
            // Remove leading and trailing spaces and add commas
            String modifiedString = x.trim();

            // Add the modified string to the ArrayList
            arr.add(modifiedString);
        }
        return arr.get(arr.size()-1).length();
        
    }
}