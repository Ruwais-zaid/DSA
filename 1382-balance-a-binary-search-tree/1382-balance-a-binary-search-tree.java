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
class Solution {
     public static void inorder(TreeNode root,ArrayList<Integer> arr){
         if(root==null){
             return;
         }
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public static TreeNode inordertobst(int s,int e,ArrayList<Integer> arr){
        if(s>e){
            return null;
        }
        int mid=s+(e-s)/2;
        TreeNode newroot=new TreeNode(arr.get(mid));
        newroot.left=inordertobst(s,mid-1,arr);
        newroot.right=inordertobst(mid+1,e,arr);
        return newroot;
        
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        return inordertobst(0,arr.size()-1,arr);
        
    }
}