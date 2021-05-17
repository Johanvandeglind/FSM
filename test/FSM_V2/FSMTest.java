package FSM_V2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FSMTest {
    /**
     * Deze functie test de Finite State Machine, het checkt of de uitkomst van de ingegeven string klopt.
     */
    @Test
    public void func_Equals() {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");

        s0.putDirections("A",s1);
        s0.putDirections("B",s0);
        s1.putDirections("A",s0);
        s1.putDirections("B",s1);
        String f = "BAAB";
        assertArrayEquals(new String[]{"s0","s0","s1","s0","s0"},FSM.func(f,s0));
        //assertEquals("hoi","hoi");
    }
}