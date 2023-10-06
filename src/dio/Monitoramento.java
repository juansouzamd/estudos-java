package dio;

import java.util.*;

public class Monitoramento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();
        String aux = "";
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            //TODO: Utilize o mapa para registrar/incrementar o serviço em questão.

            if(aux.equalsIgnoreCase(servico)){
                eventosPorServico.put(servico, +1L);
            } else{
                eventosPorServico.put(servico, 1L);
            }
                aux = servico;
        }

        //TODO: Identifique no mapa os serviços com maior e menor quantidade de logs.
        //      Dica: Utilize Java Streams para tornar essa tarefa mais simples.

        String maior = "";
        String menor = "";

        long maiorContagem = 0L;
        long menorContagem = eventosPorServico.size();
        for (Map.Entry<String, Long> map : eventosPorServico.entrySet()) {
            if(map.getValue() > maiorContagem) {
                maiorContagem = map.getValue();
                maior = map.getKey();
            }

            if(map.getValue() < menorContagem){
                menorContagem = map.getValue();
                menor = map.getKey();
            }
        }

        //TODO: Imprima a saída no padrão definido no enunciado deste desafio.

        System.out.println("Eventos por servico:");
        for (Map.Entry<String, Long> map : eventosPorServico.entrySet()) {
            System.out.println(map.getKey() + ":" + map.getValue());
        }
        System.out.println("Maior:" + maior);
        System.out.println("Menor:" + menor);
    }
}