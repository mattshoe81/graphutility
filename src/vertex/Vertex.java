package vertex;

import adjacencylist.AdjLinkedList;

public class Vertex {

    private int id;
    private Vertex parent;
    private int dist;
    private Color color;
    private int discovery;
    private int finish;
    public boolean directed;
    private AdjLinkedList adj;

    public static enum Color {
        WHITE, GRAY, BLACK, RED, YELLOW, NONE
    }

    public Vertex(int id, AdjLinkedList adj) {
        this.adj = adj;
        this.id = id;
        this.parent = null;
        this.dist = -1;
        this.color = Color.NONE;
        this.discovery = -1;
        this.finish = -1;
        this.directed = false;
    }

    public Vertex(int id, Vertex parent, AdjLinkedList adj) {
        this.adj = adj;
        this.id = id;
        this.parent = parent;
        this.dist = -1;
        this.color = Color.NONE;
        this.discovery = -1;
        this.finish = -1;
        this.directed = false;
    }

    public Vertex(int id, Vertex parent, Color color, AdjLinkedList adj) {
        this.adj = adj;
        this.id = id;
        this.parent = parent;
        this.dist = -1;
        this.color = color;
        this.discovery = -1;
        this.finish = -1;
        this.directed = false;
    }

    public int id() {
        return this.id;
    }

    public Vertex parent() {
        return this.parent;
    }

    public int dist() {
        return this.dist;
    }

    public Color color() {
        return this.color;
    }

    public int discovery() {
        return this.discovery;
    }

    public int finish() {
        return this.finish;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setDiscovery(int discovery) {
        this.discovery = discovery;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }

    public AdjLinkedList adjacencies() {
        return this.adj;
    }

    public void setAdjacencies(AdjLinkedList adj) {
        this.adj = adj;
    }

    public void addAdjacency(Vertex v) {
        this.adj.addAdjacency(v);
    }

}

//
//
//
//
//
//
//
//
//
//
//
//
//
