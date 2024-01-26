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
class Tuple{
    TreeNode node;
    int row;
    int col;
    public Tuple(TreeNode _node, int _row, int _col){
        node=_node;
        row=_row;
        col=_col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> mpp=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<>();
        q.add(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple tuple=q.poll();
            TreeNode node=tuple.node;
            int x=tuple.row;
            int y=tuple.col;
            if(!mpp.containsKey(x)){
                mpp.put(x,new TreeMap<>());
            }
            if(!mpp.get(x).containsKey(y)){
                mpp.get(x).put(y,new PriorityQueue<>());
            }
            mpp.get(x).get(y).add(node.val);
            if(node.left!=null){
                q.add(new Tuple(node.left,x-1,y+1));
            }
            if(node.right!=null){
                q.add(new Tuple(node.right,x+1,y+1));
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> p:mpp.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> val:p.values()){
                while(!val.isEmpty()){
                    ans.get(ans.size()-1).add(val.poll());
                }
            }
        }
        return ans;
    }
}