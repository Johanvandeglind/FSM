package FSM_V2;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");
        DSL.implement_DSL_Script("src/FSM_V2/DSL.txt",new Node[]{s0,s1,s2,s3});
        System.out.println(Arrays.toString(FSM.func("BAAB",s0)));
    }
}
