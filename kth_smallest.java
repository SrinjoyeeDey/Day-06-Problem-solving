public class kth_smallest {
    public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) 
            { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                    this.val = val;
                    this.left = left;
                    this.right = right;
                }
    }

class Solution {
    int preOrder=0;
    
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return -1;
        }
        int leftAns=kthSmallest(root.left,k);
            if(leftAns!=-1){
                return leftAns;
            }
            preOrder++;
            if(preOrder==k){
                return root.val;
            }
            int rightAns=kthSmallest(root.right,k);               
            if(rightAns!=-1){
                return rightAns;
            }
            return -1; 
            
        }
        
    }

}
