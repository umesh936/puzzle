package umesh.codeChallenege;


import umesh.helperDS.Node;

/**
 * <Pre>
 * This problem was asked by Google.
 *
 * A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
 *
 * Given the root to a binary tree, count the number of unival subtrees.
 *
 * For example, the following tree has 5 unival subtrees:
 * <pre>
 *     0
 *   /   \
 *  1     0
 *      /   \
 *     1     0
 *    / \   / \
 *   1   1 0   0
 * </pre>
 * </Pre>
 */
public class DailyCodeChallenge8_d {

    public static int countUnivalTree(Node root) {
        int result = 0;
        if (root.left == null && root.right == null)
            return 1;
        if (root.left.value == root.right.value)
            result = result + 1;
        result = result + countUnivalTree(root.left);
        result = result + countUnivalTree(root.right);
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        addChildren(root, 1, 0);
        addChildren(root.right, 1, 0);
        addChildren(root.right.left, 1, 1);
        addChildren(root.right.right, 0, 0);
        System.out.println(countUnivalTree(root));
    }

    public static void addChildren(Node root, Integer leftValue, Integer rightValue) {
        root.left = new Node(leftValue);
        root.right = new Node(rightValue);
    }
}
