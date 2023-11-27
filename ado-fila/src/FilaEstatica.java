public class FilaEstatica {

    private String vetorFila[];
    private int fim;

    public FilaEstatica(int maxSize) {
        vetorFila = new String[maxSize];
        fim = -1;
    }

    //Verifica se a Fila esta vazia
    public boolean isEmpty() {
        return (fim == -1);
    }

    //Verifica se a Fila esta cheia
    public boolean isFull() {
        return (fim == vetorFila.length - 1);
    }

    //Retorna o primeiro elemento da Fila
    public String peek(){
        if (!isEmpty())
            return vetorFila[0];
        else
            return null;
    }

    //Insere elemento na Fila
    public void enqueue(String j){
        if (!isFull()) {
            fim++;
            vetorFila[fim] = j;
        }
    }

    //Remove elemento da Fila
    public String dequeue(){
        int i;
        String n;

        if (!isEmpty()) {
            n = vetorFila[0];
            for (i = 0; i < fim; i++) {
                vetorFila[i] = vetorFila[i + 1];
            }
            fim--;
            return n;
        } else {
            return null;
        }
    }
}
