package dio.desafio01;

import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.

        var contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.println(contaBancaria);
        //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Informacoes:\n" +
                "Conta: " + numero +
                "\nTitular: " + titular +
                "\nSaldo: " + saldo;
    }
}
