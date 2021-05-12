package FSM_V1;

public class Node {
    Node rA;
    Node rB;
    String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setrA(Node rA) {
        this.rA = rA;
    }

    public void setrB(Node rB) {
        this.rB = rB;
    }

    public Node next_node(String InputLetter){
        if (InputLetter.equals("A")){
            return rA;
        }
        else
        {
            return rB;
        }
    }
}
