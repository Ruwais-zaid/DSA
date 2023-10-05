/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public static void travese(ListNode head,ArrayList<Integer> arr){
        ListNode curr=head;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
    }
    public static TreeNode linked(ArrayList<Integer> arr,int left,int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode newroot=new TreeNode(arr.get(mid));
        newroot.left=linked(arr,left,mid-1);
        newroot.right=linked(arr,mid+1,right);
        return newroot;
    }
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        travese(head,arr);
        return linked(arr,0,arr.size()-1);
        
        
    }
}