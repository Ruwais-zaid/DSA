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
    int i=0;
}
class Solution {
    public static int small(TreeNode root,result r,int k){
        if(root==null){
            return -1;
        }
        int left=small(root.left,r,k);
        if(left!=-1){
            return left;
        }
        r.i+=1;
        if(r.i==k){
            return root.val;
        }
        else{
            return small(root.right,r,k);
        }
        
    }
    
    public int kthSmallest(TreeNode root, int k) {
        result r=new result();
        r.i=0;
        return small(root,r,k);
        
    }
}