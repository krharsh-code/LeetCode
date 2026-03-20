class Solution {
    //version that uses the global variable
    // private TreeNode prev = null;
    // public void flatten(TreeNode root) {
    //     if (root == null)
    //         return;
    //     flatten(root.right);
    //     flatten(root.left);
    //     root.right = prev;
    //     root.left = null;
    //     prev = root;
    // }
    
    //version that does not use the global variable
    public void flatten(TreeNode root) {
        root = helper(root, null);
    }
    // helper function takes in the previous head, do the flattening and returns the head of the flatten binary tree
    private TreeNode helper(TreeNode root, TreeNode prev) {
        if (root == null) {
            return prev;
        }
        prev = helper(root.right, prev);
        prev = helper(root.left, prev);
        root.right = prev;
        root.left = null;
        prev = root;
        return root;
    }
}