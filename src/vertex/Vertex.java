package vertex;

import adjacencylist.AdjLinkedList;

/**
 * Class to represent a Vertex in a graph.
 *
 * @author Matthew Shoemaker
 *
 */
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

    public Vertex(int id) {
        this.adj = new AdjLinkedList();
        this.id = id;
        this.parent = null;
        this.dist = -1;
        this.color = Color.NONE;
        this.discovery = -1;
        this.finish = -1;
        this.directed = false;
    }

    public Vertex(int id, Vertex parent) {
        this.adj = new AdjLinkedList();
        this.id = id;
        this.parent = parent;
        this.dist = -1;
        this.color = Color.NONE;
        this.discovery = -1;
        this.finish = -1;
        this.directed = false;
    }

    public Vertex(int id, Vertex parent, Color color) {
        this.adj = new AdjLinkedList();
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

    public void clearAdjacencies() {
        this.adj.clearAdjacencies();
    }

    @Override
    public boolean equals(Object object) {
        boolean equals = true;
        if (object.getClass().equals(this.getClass())) {
            Vertex o = (Vertex) object;
            if (this.id != o.id() || this.dist != o.dist()
                    || this.color != o.color()
                    || this.discovery != o.discovery()
                    || this.finish != o.finish() || this.directed != o.directed
                    || !this.adj.equals(o.adjacencies())) {
                equals = false;
            }
        } else {
            equals = false;
        }

        return equals;
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
