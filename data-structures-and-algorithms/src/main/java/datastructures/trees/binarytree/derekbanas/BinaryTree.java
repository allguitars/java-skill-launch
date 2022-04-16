package datastructures.trees.binarytree.derekbanas;

/**
 * Derek uses the Focus approach, which always keeps tracking the current node you are focusing.
 * The parent node is always one step behind the focus node so whenever the focus reaches the
 * empty node (null), the parent can be used to add the new node as a leaf.
 */
public class BinaryTree {

    Node root;

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);

        if (root == null) {
            // if this tree is empty, the new node will be the root node
            root = newNode;
        } else {
            Node focusNode = root; // focus node is always moving, it;s the eye of the programmer
            Node parent;  // parent is waiting for adding a child

            while(true) {
                parent = focusNode;

                if(key < focusNode.key) {
                    focusNode = focusNode.leftChild;  // moving your focus

                    if (focusNode == null) {
                        // now your focus is on an empty node, so place the new child here using parent node
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;

                    if(focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void preOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            preOrderTraverseTree(focusNode.leftChild);
            preOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void postOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public Node findNode(int key) {
        Node focusNode = root;

        while (focusNode.key != key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }

            if (focusNode == null) {
                return null;
            }
        }

        return focusNode;
    }
}
