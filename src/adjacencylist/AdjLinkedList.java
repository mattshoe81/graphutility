package adjacencylist;

import linkedlist.SinglyLinkedList1;
import vertex.Vertex;

/**
 * A singly-linked list used to store references to the vertices that are
 * adjacent to the vertex at the front of the list.
 *
 * @author Matthew Shoemaker
 *
 */
public class AdjLinkedList extends SinglyLinkedList1<Vertex> {

    private class Node {
        Vertex data;
        Node next;
    }

    private Node preFront;
    private Node current;
    private Node rear;
    private int length;

    /**
     * Initializes an empty singly-linked list
     */
    public AdjLinkedList() {
        this.preFront = new Node();
        this.preFront.next = null;
        this.rear = this.preFront;
        this.current = this.preFront;
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

    public Vertex currentVertex() {
        return this.current.data;
    }

    @Override
    public Vertex advance() {
        this.current = this.current.next;

        return this.current.data;
    }

    @Override
    public int length() {
        return this.length;
    }

    public static AdjLinkedList[] getAdjacencyList(int size) {

        return new AdjLinkedList[size];
    }

    @Override
    public boolean equals(Object object) {
        boolean equals = true;
        if (this.getClass().equals(object.getClass())) {
            AdjLinkedList o = (AdjLinkedList) object;
            if (this.length == o.length) {
                int k = 0;
                while (k < this.length && equals) {
                    Vertex thisNode = this.advance();
                    Vertex oNode = o.advance();
                    if (!thisNode.equals(oNode)) {
                        equals = false;
                    }

                    k++;
                }
            }
        }

        return equals;
    }

    @Override
    public void add(T object) {
        // TODO Auto-generated method stub

    }

    @Override
    public Vertex remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void tranferFrom(Object o) {
        // TODO Auto-generated method stub

    }

    @Override
    public void newInstance() {
        // TODO Auto-generated method stub

    }

    @Override
    public Vertex removeFront() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Vertex removeRear() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Vertex contains(Vertex object) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public void tranferFrom(Vertex source) {
        // TODO Auto-generated method stub

    }

    @Override
    public void moveToRear() {
        // TODO Auto-generated method stub

    }

    @Override
    public void focus() {
        // TODO Auto-generated method stub

    }

    @Override
    public Vertex remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Vertex retreat() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void moveToFront() {
        // TODO Auto-generated method stub

    }

    @Override
    public void insert(Vertex element) {
        // TODO Auto-generated method stub

    }

}
