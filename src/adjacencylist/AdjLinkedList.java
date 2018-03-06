package adjacencylist;

import linkedlist.SinglyLinkedList;
import vertex.Vertex;

/**
 * A singly-linked list used to store references to the vertices that are
 * adjacent to the vertex at the front of the list.
 *
 * @author Matthew Shoemaker
 *
 */
public class AdjLinkedList extends SinglyLinkedList<Vertex> {

    /*
     * Constructors
     */
    public AdjLinkedList() {
        super();
    }

    public AdjLinkedList(Vertex... adjacencies) {
        for (Vertex adjacency : adjacencies) {
            this.add(adjacency);
        }
    }

    public void addAdjacencies(Vertex... adjacencies) {
        for (Vertex adjacency : adjacencies) {
            this.add(adjacency);
        }
    }

    public static AdjLinkedList[] getAdjacencyList(int length) {
        // TODO Auto-generated method stub
        return new AdjLinkedList[length];
    }

}
