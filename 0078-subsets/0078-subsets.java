import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        ArrayList<Integer> add=new ArrayList<>();
        int index=0;
        permute(nums,add,index,res);
        return res ;
    }


       void permute(int[] s,ArrayList<Integer> lst, int i, List<List<Integer>> res){
        
        // base case
        if (i == s.length) {
            res.add(new ArrayList<>(lst));
            return;
        }
        else{
            lst.add(s[i]);
            permute(s, lst, i+1,res);
            lst.remove(lst.size()-1);
            permute(s, lst, i+1,res);

        }
    }
    }