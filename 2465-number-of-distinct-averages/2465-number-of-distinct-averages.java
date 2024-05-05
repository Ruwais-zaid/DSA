class Solution {
         
 public int distinctAverages(int[] nums) {
     HashSet<Float> set = new HashSet<>();

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        while (list.size() > 0) {
            float min = Float.MAX_VALUE, max = Float.MIN_VALUE;
            int minIndex = 0, maxIndex = 0;

            // Find and remove minimum and maximum elements
            for (int i = 0; i < list.size(); i++) {
                float current = list.get(i);
                if (current < min) {
                    min = current;
                    minIndex = i;
                }
                if (current > max) {
                    max = current;
                    maxIndex = i;
                }
            }
            list.remove(minIndex);
            list.remove(maxIndex > minIndex ? maxIndex - 1 : maxIndex);

            // Calculate average and add it to the set
            set.add((min + max) / 2);
        }

        return set.size();
    }

 
}