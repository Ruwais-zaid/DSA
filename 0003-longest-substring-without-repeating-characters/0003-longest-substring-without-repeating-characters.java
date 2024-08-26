class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int i=-1;
        int j=-1;
        String str=s;
        int ans=Integer.MIN_VALUE;
        while(true){

            boolean flag1=false;
            boolean falg2 = false;
            //aquire
            while(i<str.length()-1){
                flag1=true;
                i++;
                char ch = str.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.get(ch)==2){
                    break;
                }
                else{
                    int len = i-j;
                    ans= Math.max(ans,len);

                }
            }

            //release
            while(j<i){
                falg2=true;
                j++;

                char ch = str.charAt(j);
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==1){
                    break;
                }

            }
            if(flag1==false && falg2==false){
                break;

            }
        }
        if(ans==Integer.MIN_VALUE){
            return 0;
        }
        else{
            return ans;
        }
        
    }
}