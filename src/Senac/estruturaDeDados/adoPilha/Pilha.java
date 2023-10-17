package Senac.estruturaDeDados.adoPilha;

public class Pilha {

    private char vetorPilha[];
    private int topo;

    public Pilha(int maxSize) {
        vetorPilha = new char[maxSize];
        topo = -1;
    }

    //Verifica se a Pilha esta vazia
    public boolean isEmpty() {
        return (topo == -1);
    }

    //Verifica se a Pilha esta cheia
    public boolean isFull() {
        return (topo == this.vetorPilha.length - 1);
    }

    //retorna o valor no topo da Pilha
    public char peek() {
        if (!isEmpty()) {
            return vetorPilha[topo];
        } else {
            return '\0';
        }
    }

    //empilha
    public void push(char j) {
        if (!isFull()) {
            topo++;
            vetorPilha[topo] = j;
        }
    }

    //desempilha
    public char pop() {
        if (!isEmpty()) {
            return vetorPilha[topo--];
        } else {
            return '\0';
        }
    }
}
