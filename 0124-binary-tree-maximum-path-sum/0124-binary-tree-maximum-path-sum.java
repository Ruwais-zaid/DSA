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
    int maxsum=Integer.MIN_VALUE;
}
class Solution {
    public static int  maxpath(TreeNode root,result r){
        if(root==null){
            return 0;
        }
        int left=Math.max(maxpath(root.left,r),0);
        int right=Math.max(maxpath(root.right,r),0);
        r.maxsum=Math.max(r.maxsum,left+right+root.val);
        return root.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        result r=new result();
        maxpath(root,r);
        return r.maxsum;
        
        
    }
}