public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node() {
        this.value = Integer.parseInt(null);
        this.left = null;
        this.right = null;
    }

    // Getters and Setters

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
