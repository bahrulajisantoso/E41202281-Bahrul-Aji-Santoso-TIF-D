package BinaryTree;

public class Node {
    public int id;
    public String data;
    public Node leftChild;
    public Node rightChild;

    public void diplsyNode() {
        System.out.println("{ " + id + ", " + data + "} ");
    }
}
