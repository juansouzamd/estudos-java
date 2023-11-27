public class Fila {

    private Node inicio, fim;

    //Construtor
    public Fila() {
        inicio = null;
        fim = null;
    }

    // Verifica se a Fila está vazia
    public boolean isEmpty(){
        return (inicio == null);
    }

    //Insere elemento na Fila
    public void enqueue(String dado){
        Node novoNode = new Node(dado);

        if (inicio == null) {
            inicio = novoNode;
            fim = inicio;
        } else {
            fim.setNext(novoNode);
            fim = novoNode;
        }
    }

    //Retira elemento na Fila
    public String dequeue(){
        if (isEmpty()) //se estiver vazia retorna -1
            return null;

        Node tmp = inicio;// utilizado para retornar o dado
        inicio = inicio.getNext(); // move o topo para o prox node
        if (inicio == null)
            fim = null;

        return tmp.getDado();// retorna o dado
    }

    public void display() {
        if (isEmpty())
            System.out.print("Fila vazia.");
        else {
            Node atual = inicio; // do inicio
            while (atual != null){ // até o final
                System.out.print(atual.getDado()+" ");//exibe a informações do node
                atual = atual.getNext();// move para o proximo node
            }
            System.out.println();
        }
    }

}