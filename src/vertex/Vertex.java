package vertex;

public class Vertex {

    private int id;
    private Vertex parent;
    private int dist;
    private Color color;
    private int discovery;
    private int finish;

    public static enum Color {
        WHITE, GRAY, BLACK, RED, YELLOW, NONE
    }

    public Vertex(int id) {
        this.id = id;
        this.parent = null;
        this.dist = -1;
        this.color = Color.NONE;
        this.discovery = -1;
        this.finish = -1;
    }

    public Vertex(int id, Vertex parent) {
        this.id = id;
        this.parent = parent;
        this.dist = -1;
        this.color = Color.NONE;
        this.discovery = -1;
        this.finish = -1;
    }

    public Vertex(int id, Vertex parent, int dist) {
        this.id = id;
        this.parent = parent;
        this.dist = dist;
        this.color = Color.NONE;
        this.discovery = -1;
        this.finish = -1;
    }

    public Vertex(int id, Vertex parent, int dist, Color color) {
        this.id = id;
        this.parent = parent;
        this.dist = dist;
        this.color = color;
        this.discovery = -1;
        this.finish = -1;
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

}
