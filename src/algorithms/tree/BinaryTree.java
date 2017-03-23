package algorithms.tree;

import java.util.Stack;

/**
 * @date: 23/03/2017 1:26 PM
 * @author: qinjiangbo@github.io
 */
public class BinaryTree {

    protected Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    /* 构造树 */
    public static Node init() {
        Node a = new Node('A');
        Node b = new Node('B', null, a);
        Node c = new Node('C');
        Node d = new Node('D', b, c);
        Node e = new Node('E');
        Node f = new Node('F', e, null);
        Node g = new Node('G', null, f);
        Node h = new Node('H', d, g);
        return h;// root
    }

    /* 访问节点 */
    public static void visit(Node p) {
        System.out.print(p.getKey() + " ");
    }

    public static void iterativePreorder(Node p) {
        Stack<Node> stack = new Stack<>();
        if (p != null) {
            stack.push(p);
            while (!stack.empty()) {
                p = stack.pop();
                visit(p);
                if (p.getRight() != null) { stack.push(p.getRight()); }
                if (p.getLeft() != null) { stack.push(p.getLeft()); }
            }
        }
    }

    public static void iterativeInorder(Node p) {
        Stack<Node> stack = new Stack<>();
        while (p != null || !stack.empty()) {
            while (p != null) {
                stack.push(p);
                p = p.getLeft();
            }

            if (!stack.empty()) {
                p = stack.pop();
                visit(p);
                p = p.getRight();
            }
        }
    }

    public static void iterativePostorder(Node p) {
        Stack<Node> stack = new Stack<>();
        Stack<Node> temp = new Stack<>();
        while (p != null || !stack.empty()) {
            while (p != null) {
                temp.push(p);
                stack.push(p);
                p = p.getRight();
            }
            if (!stack.empty()) {
                p = stack.pop();
                p = p.getLeft();
            }
        }
        while (!temp.empty()) {
            visit(temp.pop());
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(init());
        iterativeInorder(binaryTree.getRoot());
    }

}

class Node {
    private char key;
    private Node left, right;

    public Node(char key) {
        this(key, null, null);
    }

    public Node(char key, Node left, Node right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    public char getKey() {
        return key;
    }

    public void setKey(char key) {
        this.key = key;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
