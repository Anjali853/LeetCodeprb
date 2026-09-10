public class Leet2265 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    int ans = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    } // returns {sum, count}

    private int[] dfs(TreeNode node) {

        if (node == null) {
            return new int[] { 0, 0 };
        }

        // Get information from left subtree
        int[] left = dfs(node.left);

        // Get information from right subtree
        int[] right = dfs(node.right);

        // Calculate current subtree sum
        int sum = node.val + left[0] + right[0];

        // Calculate current subtree node count
        int count = 1 + left[1] + right[1];

        // Integer division gives floor for these non-negative values
        int average = sum / count;

        // Check whether node value equals subtree average
        if (node.val == average) {
            ans++;
        }

        return new int[] { sum, count };
    }

    public static void main(String[] args) {
        Leet2265 solution = new Leet2265();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(0);

        int result = solution.averageOfSubtree(root);

        System.out.println(result);
    }
}
