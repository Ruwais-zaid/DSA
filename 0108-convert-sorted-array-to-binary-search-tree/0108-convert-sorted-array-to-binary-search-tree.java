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
    public static TreeNode build(int[] nums,int s,int e){
        if(s>e){
            return null;
        }
        int mid=s+(e-s)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=build(nums,s,mid-1);
        root.right=build(nums,mid+1,e);
        return root;
    }
   
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0){
            return null;
        }
        int s=0;
        int e=nums.length-1;
        return build(nums,s,e);
        
    }
}