/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void getParents(TreeNode root, HashMap<TreeNode, TreeNode> parent_track){
        if(root==null)return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node.left!=null){
                q.add(node.left);
                parent_track.put(node.left,node);
            }
            if(node.right!=null){
                q.add(node.right);
                parent_track.put(node.right,node);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode, TreeNode> parent_track=new HashMap<>();
        getParents(root, parent_track);
        Queue<TreeNode> q=new LinkedList<>();
        q.add(target);
        int distance=0;
        HashMap<TreeNode,Boolean> visited=new HashMap<>();
        visited.put(target,true);
        while(!q.isEmpty()){
            if(distance==k)break;
            distance++;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null&&!visited.containsKey(node.left)){
                    q.add(node.left);
                    visited.put(node.left,true);
                }
                if(node.right!=null&&!visited.containsKey(node.right)){
                    q.add(node.right);
                    visited.put(node.right,true);
                }
                if(parent_track.get(node)!=null&&!visited.containsKey(parent_track.get(node))){
                    q.add(parent_track.get(node));
                    visited.put(parent_track.get(node),true);
                }
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }
}