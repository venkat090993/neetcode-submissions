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

    boolean result = true;

    public int calcHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int leftSubTreeHeight = calcHeight(root.left);
        int rightSubTreeHeight = calcHeight(root.right);
        if(rightSubTreeHeight > leftSubTreeHeight){
            if((rightSubTreeHeight - leftSubTreeHeight) > 1){
                        result = false;
                    }
        }else{
            if((leftSubTreeHeight - rightSubTreeHeight) > 1){
            result = false;
        }
        }
        
        return 1 + Math.max(leftSubTreeHeight, rightSubTreeHeight);
    }

    public boolean isBalanced(TreeNode root) {
        calcHeight(root);
        return result;
    }
}
