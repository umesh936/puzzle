package umesh.helperDS;

public class Node {

    public Integer value;
    public Node left;
    public Node right;

    public Node(Integer value) {
        this.value = value;
    }

    public static Node addNodeAsBinary(Node parent, Integer value) {
        if (parent == null)
            return new Node(value);
        if (value < parent.value) {
            parent.left = addNodeAsBinary(parent.left, value);
        }
        else if (value > parent.value) {
            parent.right = addNodeAsBinary(parent.right, value);
        }
        return parent;
    }


}
