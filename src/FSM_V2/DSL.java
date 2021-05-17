package FSM_V2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class DSL {

    public static void implement_DSL_Script(String FileName, Node[] nodes) throws IOException {
        //Read file and split to array with a line for each node
        Path fileName = Path.of(FileName);
        String data = Files.readString(fileName);
        data = data.replace("\n", "").replace("\r", "");
        String[] Data = data.split(";");
        //make new HashMap for directions in Node
        Map<String, Node> directions = new HashMap<String, Node>();
        //Format DSL string to Node
        for (String Line:Data){
            // rewrite dsl code to readable String
            Line = Line.replace("s=","").replace("(s’=","").replace(")","");
            String[] full = Line.split(" -> ");
            String[] dirs = full[1].split(" \\+ ");
            //read directions for current node en write it to the node
            for (String line:dirs){
                String[] Split = line.split(" : ");
                //System.out.println(Arrays.toString(Split));
                directions.put(Split[0],nodes[Integer.parseInt(Split[1])]);
                nodes[Integer.parseInt(full[0])].putDirections(Split[0],nodes[Integer.parseInt(Split[1])]);
            }

        }
    }
}
