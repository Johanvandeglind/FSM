package FSM_V2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Formatiev opdracht FSM
        String f = "BAAB";
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");
        s0.setrA(s2);s0.setrB(s1);
        s1.setrA(s1);s1.setrB(s2);
        s2.setrB(s3);
        s3.setrA(s2);s3.setrB(s1);
        System.out.println(Arrays.toString(FSM.func(f,s0)));


    }



}