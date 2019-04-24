class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    TreeNode ress = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        sreach(root, p, q);
        return ress;

    }

    public boolean sreach(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return false;
        boolean temp = false;
        if (root == q || root == p) {
            temp = true;


        }


        boolean l = sreach(root.left, p, q);
        boolean r = sreach(root.right, p, q);


        if (temp == false) {
            if (l & r) {
                ress = root;
                return false;

            } else if (l | r) {
                return true;

            } else
                return false;
        } else {
            if (l | r) {
                ress = root;
                return false;
            } else
                return true;


        }


    }
}