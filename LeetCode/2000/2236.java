class Solution {
      public boolean checkTree(TreeNode root) {
            if (root.left.val + root.right.val == root.val) {
                  return true;
            }
            return false;
      }
}