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
     public static int smallest(ArrayList<Integer> arr){
            Collections.sort(arr);
            System.out.println(arr);
            for(int i=0;i<arr.size();i++){
                if(i+1<arr.size()){
                    if(!arr.get(i).equals(arr.get(i+1))){
                        return arr.get(i+1);

                    }
                }
            }
            return -1;
        }
    public static void findmin(TreeNode root,ArrayList<Integer> arr){
            if(root==null){
                return;
            }
            arr.add(root.val);
            findmin(root.left,arr);
            findmin(root.right,arr);
    }
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        findmin(root,arr);
        return smallest(arr);
}
}