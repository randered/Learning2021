package NumberCountInTree;

public class BTree<T> {
    private BTreeNode<T> root;
    int count = 0;

    public BTree(T data, BTree<T> leftChild, BTree<T> rightChild) {
        if (data == null) {
            throw new IllegalArgumentException();
        }

        BTreeNode<T> leftChildNode = leftChild != null ? leftChild.root : null;
        BTreeNode<T> rightChildNode = rightChild != null ? rightChild.root : null;
        this.root = new BTreeNode<T>(data, leftChildNode, rightChildNode);
    }

    public BTree(T value) {
        this(value, null, null);
    }

    public BTreeNode<T> getRoot() {
        return root;
    }

    public BTreeNode<T> getLeftChildNode() {
        if (this.root != null)
        {
            return root.getLeft();
        }
        return null;
    }

    public BTreeNode<T> getRightChildNode() {
        if (this.root != null)
        {
            return root.getRight();
        }
        return null;
    }

    private int findEqual(BTreeNode<T> root, T data) {
        if(root==null){
            return count;
        }
        findEqual(root.getLeft(), data);
        if(data.equals(root.getData())){
            count++;
        }
        findEqual(root.getRight(), data);
        return count;
    }

    public void printOccurrences(T data) {
        System.out.println(findEqual(this.root, data));
    }

}
