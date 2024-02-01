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
    public TreeNode constructTree(int inorder[], int is, int ie, int postorder[], int ps, int pe, HashMap<Integer, Integer> storeIn){
        if(is>ie||ps>pe)return null;
        TreeNode root=new TreeNode(postorder[pe]);
        int pos=storeIn.get(postorder[pe]);
        root.left=constructTree(inorder, is, pos-1, postorder, ps, ps+pos-is-1, storeIn);
        root.right=constructTree(inorder, pos+1, ie, postorder, ps+pos-is, pe-1, storeIn);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int inlen=inorder.length;
        int postlen=postorder.length;
        HashMap<Integer, Integer> storeIn=new HashMap<>();
        for(int i=0;i<inlen;i++){
            storeIn.put(inorder[i], i);
        }
        TreeNode root=constructTree(inorder, 0, inlen-1, postorder, 0, postlen-1, storeIn);
        return root;
    }
}