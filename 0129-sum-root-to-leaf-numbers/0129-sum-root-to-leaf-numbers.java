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
    int a=0;
    int sum1=0;
}
class Solution {
     public static void pathsum(TreeNode root,int sum,result r) {
        if(root==null) {
            return;
        }
        r.a=sum+root.val;
        sum=r.a*10;
        if(root.left==null && root.right==null){
            r.sum1+=r.a;

        }

        pathsum(root.left,sum,r);
        pathsum(root.right,sum,r);
    }
    public int sumNumbers(TreeNode root) {
        if(root.left==null && root.right==null){
            return root.val;
        }
        int sum=10*root.val;
        result r=new result();
        pathsum(root.left,sum,r);
        pathsum(root.right,sum,r);
        return r.sum1;
        
    }
}