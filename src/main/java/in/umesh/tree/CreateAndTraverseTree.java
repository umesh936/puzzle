package umesh.tree;

/**
 * <Pre>
 * Create Binary Tree and traverse it in Pre order, inorder, postOrder.
 * </Pre>
 */
public class CreateAndTraverseTree {


    public static Node addNode(Node parent, Integer value) {
        if (parent == null)
            return new Node(value);
        if (value < parent.value) {
            parent.left = addNode(parent.left, value);
        }
        else if (value > parent.value) {
            parent.right = addNode(parent.right, value);
        }
        return parent;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        addNode(root, 3);
        addNode(root, 5);
        addNode(root, 6);
        addNode(root, 19);
        addNode(root, 27);
        addNode(root, 1);

        System.out.println(root);
    }

}

class Node {

    public Integer value;
    public Node left;
    public Node right;

    public Node(Integer value) {
        this.value = value;
    }
}
