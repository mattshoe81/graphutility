package vertex;

public class Vertex {

    private int id;
    private Vertex parent;
    private int dist;
    private Color color;

    public enum Color {
        WHITE, GRAY, BLACK, RED, YELLOW
    }

}
