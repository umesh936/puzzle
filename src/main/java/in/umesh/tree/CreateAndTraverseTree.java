package umesh.tree;

import static umesh.helperDS.Node.addNodeAsBinary;

import umesh.helperDS.Node;

/**
 * <Pre>
 * Create Binary Tree and traverse it in Pre order, inorder, postOrder.
 * </Pre>
 */
public class CreateAndTraverseTree {


    public static void main(String[] args) {
        Node root = new Node(10);
        addNodeAsBinary(root, 3);
        addNodeAsBinary(root, 5);
        addNodeAsBinary(root, 6);
        addNodeAsBinary(root, 19);
        addNodeAsBinary(root, 27);
        addNodeAsBinary(root, 1);
        System.out.println(" ==== In Pre Order == ");
        inPreOrder(root);
        System.out.println(" ==== In  In Order == ");
        inOrder(root);
        System.out.println(" ==== In Post Order == ");
        postOrder(root);
    }

    public static void inPreOrder(Node node) {
        if (node == null)
            return;
        System.out.println(node.value);
        inPreOrder(node.left);
        inPreOrder(node.right);

    }

    public static void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);

    }
    public static void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);

    }
}
