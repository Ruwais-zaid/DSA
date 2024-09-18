class Solution {
    public boolean isAnagram(String s, String t) {

    char arr[]= s.toCharArray();
    Arrays.sort(arr);
    String sorted1= new String(arr);
    char arr1[]=t.toCharArray();
        Arrays.sort(arr1);
        String sorted2 =  new String(arr1);
        
        if(sorted1.equals(sorted2)){
            return true;
        }
        else{
            return false;
        }
        
    
    }
}