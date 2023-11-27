public class Node {

    private String dado;
    private Node next;

    public Node(String dado) {
        this.dado = dado;
        next = null;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
