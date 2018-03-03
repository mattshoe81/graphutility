package adjacencylist;

import vertex.Vertex;

/**
 * A singly linked list used to store a reference to the vertices that are
 * adjacent to the vertex at the front of the list.
 *
 * @author Matthew Shoemaker
 *
 * @param <Vertex>
 *            this class is parameterized by the type Vertex
 */
public class AdjLinkedList {

    private class Node {
        Vertex data;
        Node next;
    }

    private Node preFront;
    private Node rear;
    private int length;

    public AdjLinkedList() {
        this.preFront = new Node();
        this.preFront.next = null;
        this.rear = this.preFront;
        this.length = 0;
    }

    public void addAdjacencies(Vertex[] vertices) {
        for (Vertex v : vertices) {
            this.addAdjacency(v);
        }
    }

    public void addAdjacency(Vertex v) {
        // Build the new node
        Node newNode = new Node();
        newNode.data = v;
        newNode.next = null;

        // Append it to the end, then change the rear reference to vertex
        this.rear.next = newNode;
        this.rear = newNode;
        this.length++;
    }

    public Vertex[] clearAdjacencies() {
        Node node = this.preFront.next;
        Vertex[] adjacencies = new Vertex[this.length];

        for (int k = 0; k < this.length; k++) {
            adjacencies[k] = node.data;
        }

        this.length = 0;
        this.rear = this.preFront;

        return adjacencies;
    }

    public static AdjLinkedList[] getAdjacencyList(int size) {

        return new AdjLinkedList[size];
    }

}
