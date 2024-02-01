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
    public TreeNode constructTree(int prestart, int preend, int instart, int inend, int preorder[], int inorder[], HashMap<Integer,Integer> storeIn){
        if(prestart>preend||instart>inend)return null;
        TreeNode root=new TreeNode(preorder[prestart]);
        int pos=storeIn.get(root.val);
        int left=pos-instart;
        root.left=constructTree(prestart+1, prestart+left, instart, pos-1, preorder, inorder, storeIn);
        root.right=constructTree(prestart+left+1, preend, pos+1, inend, preorder, inorder, storeIn);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> storeIn=new HashMap<>();
        int prelen=preorder.length;
        int inlen=inorder.length;
        for(int i=0;i<inlen;i++){
            storeIn.put(inorder[i],i);
        }
        TreeNode root=constructTree(0, prelen-1, 0, inlen-1, preorder, inorder, storeIn);
        return root;
    }
}