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
     public static int findpos(int arr[],int elem,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==elem){
                return i;
            }
        }
        return -1;
    }
     public static TreeNode solve(int [] arr,int [] arr1,result r,int indexstart,int indexend,int n){
        // base case;
        if(r.sum1<0 || indexstart>indexend){
            return  null;
        }
        int elment=arr1[r.sum1];
        r.sum1-=1;
        TreeNode root=new TreeNode(elment);
        int pos=findpos(arr,elment,n);
        //call
        root.right=solve(arr,arr1,r,pos+1,indexend,n);
        root.left=solve(arr,arr1,r,indexstart,pos-1,n);
        return root;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        result r=new result();
        int n=inorder.length;
        r.sum1=n-1;;
        TreeNode ans=solve(inorder,postorder,r,0,n-1,n);
        return ans;
        
    }
}