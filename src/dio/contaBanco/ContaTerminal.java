package dio.contaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o número da conta!");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("informe o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Informe o nome do cliente");
        String nome = scanner.nextLine();

        System.out.println("Informe o saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + String.format("%.2f", saldo )+", já está disponível para saque.");
    }
}
