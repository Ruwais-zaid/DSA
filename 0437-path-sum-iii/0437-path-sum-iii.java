/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class result{
   int sum1=0;
}
class Solution {
     public static void uv1(TreeNode root,ArrayList<Integer> arr,result r,int k){
         if(root==null){
           return;
       }
       arr.add(root.val);
       uv1(root.left,arr,r,k);
       uv1(root.right,arr,r,k);
       // check sum
        int size=arr.size();
        long sum=0;
        for(int i=size-1;i>=0;i--){
            sum+=arr.get(i);
            if(sum==k){
                r.sum1+=1;
            }
        }
        arr.remove(arr.size()-1);

    }
    public int pathSum(TreeNode root, int targetSum) {
        result r=new result();
        ArrayList<Integer> arr=new ArrayList<>();
        uv1(root,arr,r,targetSum);
        return r.sum1;
        
        
    }
}