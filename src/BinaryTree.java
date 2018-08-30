
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alessandro Medeiros
 */
public class BinaryTree {

    static Node root;
    private int contador;
    public void add(String value) {
        root = addRecursive(root, value);
        contador++;
    }

    public int getContador() {
        return contador;
    }
    
    

    private Node addRecursive(Node current, String value) {
        if (current == null) {
            return new Node(value);
        }

        if (value.length() < current.value.length()) {
            current.left = addRecursive(current.left, value);
        } else if (value.length() > current.value.length()) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    private boolean containsNodeRecursive(Node current, String value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value.length() < current.value.length()
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(String value) {
        return containsNodeRecursive(root, value);
    }

    /*@Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt = createBinaryTree();

        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));

        assertFalse(bt.containsNode(1));
    }*/
    public void delete(String value) {
        deleteRecursive(root, value);
    }

    private Node deleteRecursive(Node current, String value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Node to delete found
            // ... code to delete the node will go here
        }
        if (value.length() < current.value.length()) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    public static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }

    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

//    public static BinaryTree createBinaryTree() {
//        BinaryTree bt = new BinaryTree();
//
//        bt.add("6");
//        bt.add("4");
//        bt.add("8");
//        bt.add("3");
//        bt.add("5");
//        bt.add("7");
//        bt.add("9");
//
//        return bt;
//    }

    /*public static void main(String[] args) {
        createBinaryTree();
        traverseInOrder(root);
    }*/

}
