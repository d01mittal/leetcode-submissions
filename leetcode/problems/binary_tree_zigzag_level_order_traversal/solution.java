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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return ans;
        q.add(root);
        q.add(null);
        List<Integer> l=new ArrayList<>();
        int flag=0;
        while(!q.isEmpty()){
            TreeNode node=q.remove();
            if(node==null){
                ans.add(l);
                l=new ArrayList<>();
                flag=1-flag;
                if(!q.isEmpty())
                q.add(null);
            }
            else{
                if(flag==0){
                    l.add(node.val);
                }
                else{
                    l.add(0,node.val);
                }
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
        }
        return ans;
    }
}