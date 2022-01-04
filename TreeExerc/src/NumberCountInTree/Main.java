package NumberCountInTree;

public class Main {

    public static void main(String[] args) {
        // Create the binary tree from the sample.

        BTree<Integer> binaryTree =

                new BTree<Integer>(6,
                        new BTree<Integer>(19,
                                new BTree<Integer> (23),
                                new BTree<Integer> (6,
                                        new BTree<Integer>(6),
                                        new BTree<Integer>(21))),
                        new BTree<Integer>(15,
                                new BTree<Integer>(3), null));
        // Traverse and print the tree in pre-order manner.

        binaryTree.printOccurrences(6);



        // Console output:

        // 23 19 10 6 21 14 3 15

    }

}
