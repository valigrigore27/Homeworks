import java.util.List;
public class Network<T extends Node> {

    private NodeContainer<T> nodeContainer;

    public Network() {
        nodeContainer = new NodeContainer<>();
    }

    public void addNode(T node) {
        nodeContainer.addNode(node);
    }

    public List<T> getNodes() {
        return nodeContainer.getNodes();
    }

    public static void main(String[] args) {
        Network<Node> network = new Network<>();

        Person person1 = new Person("John Smith", "1995-10-3", 180);
        Person person2 = new Person("Jane Doe", "1993-03-12", 178);
        Company company1 = new Company("Acme Inc.", 2002, "USA");

        network.addNode(person1);
        network.addNode(person2);
        network.addNode(company1);

        List<Node> nodes = network.getNodes();
        for (Node node : nodes) {
            System.out.println(node.getNodeName());
        }
    }
}