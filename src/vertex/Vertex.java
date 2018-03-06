package vertex;

import java.util.LinkedList;

/**
 * Class to represent a Vertex in a graph.
 *
 * @author Matthew Shoemaker
 *
 */
public class Vertex {

    private String id;
    private Vertex parent;
    private int dist;
    private Color color;
    private int discovery;
    private int finish;
    public boolean directed;
    private LinkedList<Vertex> adjacencies;

    public static enum Color {
        WHITE, GRAY, BLACK, RED, YELLOW, NONE
    }

    public Vertex(String id) {
        this.adjacencies = new LinkedList<Vertex>();
        this.id = id;
        this.parent = null;
        this.dist = -1;
        this.color = Color.NONE;
        this.discovery = -1;
        this.finish = -1;
        this.directed = false;
    }

    public Vertex(String id, Vertex parent) {
        this.adjacencies = new LinkedList<Vertex>();
        this.id = id;
        this.parent = parent;
        this.dist = -1;
        this.color = Color.NONE;
        this.discovery = -1;
        this.finish = -1;
        this.directed = false;
    }

    public Vertex(String id, Vertex parent, Color color) {
        this.adjacencies = new LinkedList<Vertex>();
        this.id = id;
        this.parent = parent;
        this.dist = -1;
        this.color = color;
        this.discovery = -1;
        this.finish = -1;
        this.directed = false;
    }

    public String id() {
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

    public void setId(String id) {
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

    public LinkedList<Vertex> adjacencies() {
        return this.adjacencies;
    }

    public void setAdjacencies(LinkedList<Vertex> adj) {
        this.adjacencies = adj;
    }

    public void addAdjacency(Vertex v) {
        this.adjacencies.add(v);
    }

    public void clearSearchData() {
        this.color = Color.WHITE;
        this.dist = -1;
        this.parent = null;
    }

    public void setDistance(int distance) {
        this.dist = distance;
    }

    public int getDistance() {
        return this.dist;
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
                    || !this.adjacencies.equals(o.adjacencies())) {
                equals = false;
            }
        } else {
            equals = false;
        }

        return equals;
    }

    @Override
    public String toString() {
        return this.id;
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
