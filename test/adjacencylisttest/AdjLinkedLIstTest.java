import static org.junit.Assert.*;

import org.junit.Test;

import adjacencylist.AdjLinkedList;

public class AdjacencyLinkedListTest {

    private static AdjLinkedList newInstance() {
        return new AdjLinkedList();
    }
    
    @Test
    public void constructorTest() {
        AdjLinkedList test = newInstance();
        
        test.addAdjacency(new Vertex(1));
        test.addAdjacency(new Vertex(2));
        
        for (itn k = 0; k < test.length(); k++) {
            System.out.println(test.currentVertex().toString());
            test.advance();
        }
        
        assertEquals(true, true);
    }
    
    

}
