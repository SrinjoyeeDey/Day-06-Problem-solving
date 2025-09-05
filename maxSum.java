public class maxSum {
     public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
 }

class Solution {
    int maxSum=0;
    public int maxSumBST(TreeNode root) {
        helper(root);
        return maxSum;
    }
    private int[] helper(TreeNode root){
    if(root==null){
        return new int[]{1,0,Integer.MAX_VALUE,Integer.MIN_VALUE};
    }
    int[] left=helper(root.left);
    int[] right=helper(root.right);

    if(left[0]==1 && right[0]==1 && root.val>left[3] && root.val<right[2]){
        int sum=left[1]+right[1]+root.val;
        maxSum=Math.max(maxSum,sum);

        int minVal=Math.min(left[2],root.val);
        int maxVal=Math.max(right[3],root.val);
        return new int[]{1,sum,minVal,maxVal};

    }
    else{
        return new int[]{0,0,0,0};
    }

    }
}
}
