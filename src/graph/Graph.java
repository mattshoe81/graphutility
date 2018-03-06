package graph;

import java.util.LinkedList;

import vertex.Vertex;
import vertex.Vertex.Color;

/**
 * Class to represent a Graph.
 *
 * @author Matthew Shoemaker
 *
 */
public class Graph {
    private LinkedList<Vertex> vertices;

    public Graph(LinkedList<Vertex> vertices) {
        this.vertices = vertices;
    }

    public void setVertices(LinkedList<Vertex> vertices) {
        this.vertices = vertices;
    }

    public LinkedList<Vertex> vertices() {
        return this.vertices;
    }

    public void BFS(int indexOfSourceVertex) {

        // Clear all search data for every vertex
        for (Vertex v : this.vertices) {
            v.setColor(Color.WHITE);
            v.setDistance(0);
            v.setParent(null);
        }

        // Get the source vertex
        Vertex source = this.vertices.get(indexOfSourceVertex);
        // Set source to gray, distance 0 and no parent
        source.setDistance(0);
        source.setColor(Color.GRAY);
        source.setParent(null);

        // This will serve as the queue
        LinkedList<Vertex> grayVertices = new LinkedList<>();

        // Add source to the queue to start
        grayVertices.add(source);
        System.out.println("Source Vertex: " + source.id());

        /**
         * Perform the breadth first search
         */
        while (grayVertices.size() > 0) {
            // Dequeue the vertex at the front of the queue
            Vertex currentParent = grayVertices.removeFirst();
            LinkedList<Vertex> adjacenciesOfParent = currentParent
                    .adjacencies();
            for (Vertex child : adjacenciesOfParent) {
                // If the child has not already been checked
                if (child.color() == Color.WHITE) {
                    // Now it's checked, so paint it gray
                    child.setColor(Color.GRAY);
                    // Its distance is 1 further than the parent
                    child.setDistance(currentParent.getDistance() + 1);
                    // Its parent is obvious
                    child.setParent(currentParent);
                    // Add this child to the queue of gray vertices
                    grayVertices.addLast(child);
                }
            }
            // Now all of the parent's children have been checked, paint it black
            currentParent.setColor(Color.BLACK);
        }

    }

    public static void main(String[] args) {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");

        LinkedList<Vertex> adjA = new LinkedList<>();
        adjA.add(b);
        LinkedList<Vertex> adjB = new LinkedList<>();
        adjB.add(a);
        adjB.add(c);
        LinkedList<Vertex> adjC = new LinkedList<>();
        adjC.add(b);
        adjC.add(d);
        adjC.add(e);
        LinkedList<Vertex> adjD = new LinkedList<>();
        adjD.add(c);
        adjD.add(e);
        adjD.add(f);
        adjD.add(g);
        LinkedList<Vertex> adjE = new LinkedList<>();
        adjE.add(c);
        adjE.add(d);
        adjE.add(f);
        LinkedList<Vertex> adjF = new LinkedList<>();
        adjF.add(d);
        adjF.add(e);
        LinkedList<Vertex> adjG = new LinkedList<>();
        adjG.add(d);

        a.setAdjacencies(adjA);
        b.setAdjacencies(adjB);
        c.setAdjacencies(adjC);
        d.setAdjacencies(adjD);
        e.setAdjacencies(adjE);
        f.setAdjacencies(adjF);
        g.setAdjacencies(adjG);

        LinkedList<Vertex> vertices = new LinkedList<>();
        vertices.add(a);
        vertices.add(b);
        vertices.add(c);
        vertices.add(d);
        vertices.add(e);
        vertices.add(f);
        vertices.add(g);

        Graph graph = new Graph(vertices);

        graph.BFS(6);

        for (int k = 0; k < vertices.size(); k++) {
            System.out.print("Level " + k + ": ");
            for (Vertex v : vertices) {
                if (v.getDistance() == k) {
                    System.out.print(v.id() + ", ");
                }
            }
            System.out.println("");
        }

    }

}

////
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
