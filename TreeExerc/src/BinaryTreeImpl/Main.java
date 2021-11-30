package BinaryTreeImpl;

public class Main {
    static BSTNode mainRoot;

    public static void main(String[] args) {
        BinaryTreeImpl.insert(mainRoot,15);
        BinaryTreeImpl.insert(mainRoot,10);
        BinaryTreeImpl.insert(mainRoot,20);
        BinaryTreeImpl.insert(mainRoot,25);
        BinaryTreeImpl.insert(mainRoot,8);
        BinaryTreeImpl.insert(mainRoot,12);
        BinaryTreeImpl.checkIfExist(mainRoot,12);
        
    }
}
