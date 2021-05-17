package FSM_V2;
import java.util.HashMap;
import java.util.Map;

public class Node {
    String Name;
    Map<String, Node> directions = new HashMap<String, Node>();
    public void putDirections(String key, Node node) {
        directions.put(key, node);
    }

    public Map<String, Node> getDirections() {
        return directions;
    }

    public Node(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }

    public Node nextNode(String InputLetter){
        if (directions.containsKey(InputLetter)){
            return directions.get(InputLetter);
        }
        else{
            throw new RuntimeException("Letter "+ InputLetter +" not in Node "+Name);
        }
    }
}
