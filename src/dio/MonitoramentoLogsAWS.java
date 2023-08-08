package dio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEventos = 0;
        Map<String, Integer> eventosPorServico = new HashMap<>();
        String maiorServico = "";
        String menorServico = "";

        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        //TODO:  realize a análise dos logs e retorne os seus resultados



        scanner.close();
    }
}