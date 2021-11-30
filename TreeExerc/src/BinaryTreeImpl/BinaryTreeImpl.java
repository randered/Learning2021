package BinaryTreeImpl;

public abstract class BinaryTreeImpl {

    private static boolean search(BSTNode root, int data) {
        if (Main.mainRoot == null) return false;
        else if (root == null) return false;
        else if (root.getData() == data) return true;
        else if (data <= root.getData()) return search(root.getLeft(), data);
        else return search(root.getRight(), data);
    }

    static void checkIfExist(BSTNode root, int data) {
        if(search(root,data)){
            System.out.println("Number was Found !");
        }else{
            System.out.println("Number was not Found");
        }
    }

    static BSTNode insert(BSTNode root, int data) {
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

    static public BSTNode getNewNode(int data) {
        BSTNode newNode = new BSTNode(data);
        newNode.setLeft(null);
        newNode.setRight(null);
        return newNode;
    }
}
