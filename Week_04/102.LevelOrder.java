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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if(root==null){
            return results;
        }
        bfs(root,results);
        return results;
    }

    private void bfs(TreeNode root,List<List<Integer>> results){
        int count = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(queue.size()>0){
            int levelLength = queue.size();
            List<Integer> result = new ArrayList<Integer>();
            for(int i = 0 ; i < levelLength; i ++){
                TreeNode front = queue.poll();
                result.add(front.val);
                if(front.left!=null){
                    queue.offer(front.left);
                }
                if(front.right!=null){
                    queue.offer(front.right);
                }
            }
            results.add(result);
        }
    }
}
