package vertextest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import vertex.Vertex;

public class VertexTest {

    @Test
    public void equalsTest_routineTrue() {
        Vertex test = new Vertex(1);
        Vertex exp = new Vertex(1);

        boolean result = test.equals(exp);

        assertEquals(true, result);

    }

}
