package graph;

import java.util.List;

import adjacencylist.AdjLinkedList;
import vertex.Vertex;

public class Graph {
    private List<Vertex> vertices;
    private AdjLinkedList[] adj;

    public Graph(List<Vertex> vertices) {
        this.adj = AdjLinkedList.getAdjacencyList(vertices.size());
        this.vertices = vertices;
    }

    public void buildAdjacencyList(AdjLinkedList... adjLinkedLists) {
        assert this.adj.length == adjLinkedLists.length : "Violation of: this.adj.length = adjLinkedLists.length";

        for (int k = 0; k < adjLinkedLists.length; k++) {
            this.adj[k] = adjLinkedLists[k];
        }
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    public List<Vertex> vertices() {
        return this.vertices;
    }

    public AdjLinkedList[] adjacencyList() {
        return this.adj;
    }

}
