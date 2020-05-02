package umesh.codeChallenege;

/**
 * <pre>
 * This problem was asked by Google.
 *
 * Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.
 *
 * For example, given the following Node class
 *
 * class Node:
 *     def __init__(self, val, left=None, right=None):
 *         self.val = val
 *         self.left = left
 *         self.right = right
 * The following test should pass:
 *
 * node = Node('root', Node('left', Node('left.left')), Node('right'))
 * assert deserialize(serialize(node)).left.left.val == 'left.left'
 *
 *            root
 *           /    \
 *          /      \
 *        /         \
 *     Left         Right
 *     /  \         /   \
 *    /    \       /     \
 *  Left1 Right1  X    Right2
 *   /  \   /\         /    \
 Left2  X  X  x        X    X
 *   / \
 *   X  x
 *
 * </pre>
 */
public class DailyCodeChallenge3_d {

    private static String stringToProcess;

    public static String serializes(Node rootNode) {
        if(rootNode ==null) return "X,";
        return rootNode.value+"," + serializes(rootNode.left) + serializes(rootNode.right);

    }

    public static Node deserializes() {
        if (stringToProcess == null || stringToProcess.length() == 1)
            return null;
        String currentProcessingNodeStr = stringToProcess.substring(0, stringToProcess.indexOf(","));
        stringToProcess = stringToProcess.substring(stringToProcess.indexOf(",") + 1);
        if (currentProcessingNodeStr.contains("X"))
            return null;
        Node processingNode = new Node(currentProcessingNodeStr);
        processingNode.left = deserializes();
        processingNode.right = deserializes();
        return processingNode;
    }

    public static void main(String[] args) {
        System.out.println("------  Test 1 --------");
        stringToProcess = "root,Left,Left1,Left2,X,X,X,Right1,X,X,Right,X,Right2,X,X";
        Node rootNode = deserializes();
        System.out.println(serializes(rootNode));

    }


    static class Node {

        public String value;
        public Node left;
        public Node right;

        public Node(String value) {
            this.value = value;
        }

    }
}
