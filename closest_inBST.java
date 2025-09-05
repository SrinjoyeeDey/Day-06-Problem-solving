import java.util.*;
public class closest_inBST {
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

    public static int minDiff(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        ans = Math.min(ans, Math.abs(root.val - k));
        if(root.val>k){
            minDiff(root.left, k);
        }
        else{
            minDiff(root.right, k);
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}