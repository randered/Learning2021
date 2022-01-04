package BinaryTreeImpl;

public abstract class BinaryTreeImpl {

    private static boolean search(TreeNodeOne root, int data) {
        if (Main.mainRoot == null) return false;
        else if (root == null) return false;
        else if (root.getData() == data) return true;
        else if (data <= root.getData()) return search(root.getLeft(), data);
        else return search(root.getRight(), data);
    }

    static void checkIfExist(TreeNodeOne root, int data) {
        if (search(root, data)) {
            System.out.println("Number was Found !");
        } else {
            System.out.println("Number was not Found");
        }
    }

    static TreeNodeOne insert(TreeNodeOne root, int data) {
        if (Main.mainRoot == null) {
            Main.mainRoot = getNewNode(data);
        } else if (root == null) {
            root = getNewNode(data);
        } else if (data <= root.getData()) {
            root.setLeft(insert(root.getLeft(), data));
        } else {
            root.setRight(insert(root.getRight(), data));
        }
        return root;
    }

    static public TreeNodeOne getNewNode(int data) {
        TreeNodeOne newNode = new TreeNodeOne(data);
        newNode.setLeft(null);
        newNode.setRight(null);
        return newNode;
    }

    static int getMin(TreeNodeOne root) {
        // Implemented with recursion.
        if (root == null) {
            System.out.println("Tree is Empty");
            return -1;
        } else if (root.getLeft() == null) {
            return root.getData();
        }
        return getMin(root.getLeft());
    }

    static int getMax(TreeNodeOne root) {
        // Implemented with while loop
        if (root == null) {
            System.out.println("Tree is Empty");
            return -1;
        } else {
            while(root.getRight() !=null){
                root = root.getRight();
            }
        }
        return root.getData();
    }
}