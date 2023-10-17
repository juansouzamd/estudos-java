package Senac.estruturaDeDados.pilhaEstatica;

public class TestePilha {

    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha(10);

        minhaPilha.push((char) 20);
        minhaPilha.push((char) 40);
        minhaPilha.push((char) 60);
        minhaPilha.push((char) 80);

        while (!minhaPilha.isEmpty()) {
            int value = minhaPilha.pop();
            System.out.print(value + " ");
        }
        System.out.print("\n");
    }
}