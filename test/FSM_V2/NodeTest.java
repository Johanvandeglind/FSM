package FSM_V2;


import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    /**
     * Test de directions van de nodes en het maken hiervan
     */

    @Test
    public void nextNodeEquals() {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");

        s0.putDirections("A",s1);
        s0.putDirections("B",s2);

        assertEquals(s1,s0.nextNode("A"));
    }
    public void nextNodeNotEquals() {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");

        s0.putDirections("A",s1);
        s0.putDirections("B",s2);

        assertNotEquals(s0,s0.nextNode("A"));
    }

}