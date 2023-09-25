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



class Result {
    int maxLength; // This will store the length of the longest univalue path
}
class Solution{

public int LongestUnivaluePath(TreeNode root, Result result) {
    if (root == null) {
        return 0;
    }

    int leftLength = LongestUnivaluePath(root.left, result);
    int rightLength = LongestUnivaluePath(root.right, result);

    int leftArrow = 0;
    int rightArrow = 0;

    if (root.left != null && root.left.val == root.val) {
        leftArrow = leftLength + 1;
    }

    if (root.right != null && root.right.val == root.val) {
        rightArrow = rightLength + 1;
    }

    result.maxLength = Math.max(result.maxLength, leftArrow + rightArrow);

    return Math.max(leftArrow, rightArrow);
}

    public int longestUnivaluePath(TreeNode root) {
        Result result = new Result();
        LongestUnivaluePath(root, result);
        return result.maxLength;
}
}
    