package FSM_V2;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.*;

public class DSLTest {
    /**
     * dit script test het lezen en inmplementeren van de DSL code
      */

    @Test
    public void implement_DSL_Script_Equals() throws IOException {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");

        DSL.implement_DSL_Script("test/FSM_V2/test_DSL.txt",new Node[]{s0,s1});
        assertEquals(new HashMap<String, Node>(){{put("A", s0);put("B", s1);}},s0.getDirections());
    }
    @Test
    public void implement_DSL_Script_NotEquals() throws IOException {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");

        DSL.implement_DSL_Script("test/FSM_V2/test_DSL.txt",new Node[]{s0,s1});
        assertNotEquals(new HashMap<String, Node>(){{put("A", s1);put("B", s1);}},s0.getDirections());
    }
}