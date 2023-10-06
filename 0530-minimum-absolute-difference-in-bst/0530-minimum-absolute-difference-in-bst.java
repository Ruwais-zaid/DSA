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
    int max=Integer.MAX_VALUE;
}
class Solution {
    public static void checkmin(ArrayList<Integer> arr,result r){
        for(int i=0;i<arr.size();i++){
            if(i+1<arr.size()){
                if(Math.abs(arr.get(i)-arr.get(i+1))<r.max){
                    r.max=Math.abs(arr.get(i)-arr.get(i+1));
                }
                }
        }
    }
     public static void inorder(TreeNode root,ArrayList<Integer> arr){
         if(root==null){
             return;
         }
         inorder(root.left,arr);
         arr.add(root.val);
         inorder(root.right,arr);
     }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        result r=new result();
        r.max=Integer.MAX_VALUE;
        inorder(root,arr);
        checkmin(arr,r);
        return r.max;
        
    }
}