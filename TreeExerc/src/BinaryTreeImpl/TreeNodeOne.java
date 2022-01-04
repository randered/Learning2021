package BinaryTreeImpl;

public class TreeNodeOne {
    private int data;
    private TreeNodeOne left;
     private TreeNodeOne right;

    public TreeNodeOne() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public TreeNodeOne(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNodeOne getLeft() {
        return left;
    }

    public void setLeft(TreeNodeOne left) {
        this.left = left;
    }

    public TreeNodeOne getRight() {
        return right;
    }

    public void setRight(TreeNodeOne right) {
        this.right = right;
    }
}
