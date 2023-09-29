class count{
    int r=0;
}
class Solution {
    public static void  checkvowel(String first,String last,count c){
        if(first.equals("a") || first.equals("e") || first.equals("i") ||first.equals("o") || first.equals("u")) {
            if (last.equals("a") || last.equals("e") || last.equals("i") || last.equals("o") || last.equals("u")) {
                c.r += 1;
            }
        }

    }
     public static void coutvow(String[] word,int left,int right,count c){
        for(int i=left;i<right+1;i++) {
            String ans = word[i];
            String first = ans.substring(0, 1);
            String last = ans.substring(ans.length() - 1);
            checkvowel(first, last,c);
        }
     }
    public int vowelStrings(String[] words, int left, int right) {
        count c=new count();
        c.r=0;
        coutvow(words,left,right,c);
        return c.r;
        
    }
}