import java.util.ArrayList;
import java.util.List;

public class NodeContainer<T extends Node> {
    private List<T> nodes;

    public NodeContainer() {
        nodes = new ArrayList<>();
    }

    public void addNode(T node) {
        nodes.add(node);
    }

    public List<T> getNodes() {
        return nodes;
    }

    public T getNodeByName(String name) {
        for (T node : nodes) {
            if (node.getNodeName().equals(name)) {
                return node;
            }
        }
        return null;
    }

}


