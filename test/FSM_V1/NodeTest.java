package FSM_V1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void next_node() {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");

        s0.setrA(s0);s0.setrB(s1);
        s1.setrA(s1);s1.setrB(s2);

        assertEquals(s1,s0.nextNode("B"));
    }


}