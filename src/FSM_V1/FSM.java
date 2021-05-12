package FSM_V1;

import java.util.Arrays;

public class FSM {

    public static String[] func(String inputString,Node node){
        String[] str_volgorde = new String[inputString.length()+1];
        str_volgorde[0]="s0";
        String[] F = inputString.split("");
        Node[] listNode = new Node[inputString.length()+1];
        listNode[0] = node;
        str_volgorde[0] = node.getName();
        System.out.println(Arrays.toString(str_volgorde));
        for(int i = 1; i < inputString.length()+1; i++)
        {
            listNode[i] = listNode[i-1].next_node(F[i-1]);
            str_volgorde[i] = listNode[i].getName();
            System.out.println(Arrays.toString(str_volgorde));
        }
        return str_volgorde;
    }

}
