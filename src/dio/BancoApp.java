package dio;

import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double valorInicial = scanner.nextDouble();


        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();


        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        double valueFinal = valorInicial * (Math.pow(1+taxaJuros, periodo));

        System.out.println("Valor final do investimento: R$ " + String.format("%.2f",valueFinal));

        scanner.close();
    }
}
