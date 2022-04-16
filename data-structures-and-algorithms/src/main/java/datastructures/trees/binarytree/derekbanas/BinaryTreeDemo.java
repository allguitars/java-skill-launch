package datastructures.trees.binarytree.derekbanas;

// https://youtu.be/M6lYob8STMI

public class BinaryTreeDemo {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.addNode(50, "Boss");  // the first node will be the root
        tree.addNode(25, "VP");
        tree.addNode(15, "Office Manager");
        tree.addNode(30, "Secretary");
        tree.addNode(75, "Sales Manager");
        tree.addNode(85, "Salesman 1");

        System.out.println(">>>> In-order Traversal");
        tree.inOrderTraverseTree(tree.root);

        System.out.println(">>>> Pre-order Traversal");
        tree.preOrderTraverseTree(tree.root);

        System.out.println(">>>> Post-order Traversal");
        tree.postOrderTraverseTree(tree.root);

        System.out.println(">>>> Finding node with key 75");
        System.out.println(tree.findNode(75));
    }
}