package BSTree;

import java.util.Objects;

public class BSTreeNode<T extends Comparable<T>>
        implements Comparable<BSTreeNode<T>> {
    T data;
    BSTreeNode<T> parent;
    BSTreeNode<T> leftChild;
    BSTreeNode<T> rightChild;

    public BSTreeNode(T data, BSTreeNode<T> parent) {
        this.data = data;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

    @Override
    public boolean equals(Object obj) {
        BSTreeNode<T> other = (BSTreeNode<T>) obj;
        return this.compareTo(other) == 0;
    }

    @Override
    public int hashCode() {
        return this.data.hashCode();
    }

    @Override
    public int compareTo(BSTreeNode<T> other) {
        return 0;
    }
}
