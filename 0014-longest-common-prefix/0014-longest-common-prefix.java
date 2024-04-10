class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String prefix=strs[0];
        String ch="";
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
            ch=prefix;
        }
        return prefix;
        
    }
}