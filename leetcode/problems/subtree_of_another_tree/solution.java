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
    public static boolean isIdentical(TreeNode T, TreeNode S){
		if(T==null&&S==null)return true;
		if(T==null||S==null)return false;
		return (T.val==S.val)&&isIdentical(T.left,S.left)&&isIdentical(T.right,S.right);
	}
    public boolean isSubtree(TreeNode T, TreeNode S) {
        if(S==null)return true;
		if(T==null)return false;
	    if(isIdentical(T,S))
			return true;
		return isSubtree(T.left,S)||isSubtree(T.right,S);
    }
}