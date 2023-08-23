package Senac.poo.exercicio01;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("juan", "123456789");

        contaCorrente.depositar(1000);

        System.out.println(contaCorrente.getSaldo());

        contaCorrente.sacar(50);

        System.out.println(contaCorrente.getSaldo());

        ContaEspecial contaEspecial = new ContaEspecial();

        contaEspecial.depositar(1000);

        contaEspecial.sacar(50);

        System.out.println(contaEspecial.getSaldo());
    }
}
