package FSM_V2;

public class Node {
    Node rA;
    Node rB;
    String Name;

    public Node(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }
    public void setrA(Node rA) {
        this.rA = rA;
    }

    public void setrB(Node rB) {
        this.rB = rB;
    }

    public Node nextNode(String InputLetter){
        if (InputLetter.equals("A")){
            return rA;
        }
        else
        {
            return rB;
        }
    }
}
