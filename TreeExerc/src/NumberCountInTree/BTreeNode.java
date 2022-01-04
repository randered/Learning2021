package NumberCountInTree;

public class BTreeNode<T> {
    private T data;
    private BTreeNode<T> left;
    private BTreeNode<T> right;
    private boolean hasParent;

    public BTreeNode(T data, BTreeNode<T> left, BTreeNode<T> right) {
        if (data == null) {
            throw new IllegalArgumentException("Data is NULL!");
        }
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BTreeNode(T data) {
        this(data, null, null);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BTreeNode<T> data) {
        if (data == null || data.hasParent) {
            throw new IllegalArgumentException();
        }
        data.hasParent = true;
        this.left = data;
    }

    public BTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BTreeNode<T> data) {
        if (data == null || data.hasParent) {
            throw new IllegalArgumentException();
        }
        data.hasParent = true;
        this.right = data;
    }
}
