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

        System.out.println(root);
    }
}
