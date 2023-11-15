class result{
    String b="";
}
class Solution {
    public static void reverse(result r){
        StringBuilder input=new StringBuilder();
        input.append(r.b);
        input.reverse();
        r.b= String.valueOf(input);
    }
    public String finalString(String s) {
        result r=new result();
        r.b="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                reverse(r);

            }
            else{
                r.b+=s.charAt(i);
            }

        }
        return r.b;
        
    }
}