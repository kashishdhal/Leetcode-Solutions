class Solution {
    int count = 0;
        public int helper(TreeNode root)
        {
        	if(root == null)
        		return 0;
        	int left = helper(root.left);
        	int right = helper(root.right);
        	count+= Math.abs(left)+Math.abs(right);
        	return (left+right+root.val-1);
        }
        public int distributeCoins(TreeNode root) {
        	helper(root);
            return count;
        }
}