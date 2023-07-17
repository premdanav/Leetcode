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
    public int minDepth(TreeNode root) {
      if(root==null)
        return 0;
        Queue<TreeNode>q1= new LinkedList<>();
        int l=0;
        q1.add(root);
        q1.add(null);
        while(!q1.isEmpty()){
            TreeNode curr=q1.poll();
            if(curr==null){
                if(!q1.isEmpty()){
                    q1.add(null);
                }
                l++;
            }else{
                if(curr.left==null && curr.right==null)
                    return l+1;
                 if(curr.left!=null)
                    q1.add(curr.left);
                 if(curr.right!=null)
                    q1.add(curr.right);      
            }
        }
        return l;
    }
}