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
    public static TreeNode construct(int[] preorder,int min,int max,result r){
         //base case
        if(r.i>=preorder.length){
            return null;
        }
        if(preorder[r.i]>max || preorder[r.i]<min){
            return null;
        }
        TreeNode root=new TreeNode(preorder[r.i++]);
        root.left=construct(preorder,min,root.val,r);
        root.right=construct(preorder,root.val,max,r);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int min= Integer.MIN_VALUE;
        int max= Integer.MAX_VALUE;
        result r=new result();
        r.i=0;
        return construct(preorder,min,max,r);
        
    }
}