import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CocinaMexico {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fila filaVip = new Fila();
        Fila filaComum = new Fila();
        FilaEstatica filaTempoComum = new FilaEstatica(100);
        char opcao;
        char opcaoCliente;

        do {

            write("\nRestaurante Cocina Mexico");
            write("1. Cadastrar Cliente");
            write("2. Chamar Próximo Cliente");
            write("0. Sair");
            write("Escolha uma opção:");
            opcao = in.nextLine().charAt(0);

            switch (opcao) {

                case '1':

                    do {

                        write("\nCliente vip?");
                        write("1. Sim");
                        write("2. Não");
                        opcaoCliente = in.nextLine().charAt(0);

                    } while (opcaoCliente != '1' && opcaoCliente != '2');


                    write("\nInforme o nome do cliente:");
                    String nome = in.nextLine();

                    if (opcaoCliente == '1') {
                        filaVip.enqueue(nome);
                    } else {
                        LocalTime horaAtual = LocalTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
                        String horaMinutos = horaAtual.format(formatter);

                        filaComum.enqueue(nome);
                        filaTempoComum.enqueue(horaMinutos);
                    }
                    break;

                case '2':

                    if(filaComum.isEmpty() && filaVip.isEmpty()){
                        write("\nSala de espera vazia");

                    } else if (!filaVip.isEmpty()) {

                        if(!filaTempoComum.isEmpty()){

                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
                            LocalTime horaAnterior = LocalTime.parse(filaTempoComum.peek(), formatter);
                            LocalTime horaAtual = LocalTime.now();

                            Duration diferenca = Duration.between(horaAnterior, horaAtual);

                            if (diferenca.toMinutes() >= 20){
                                write("\nPode entrar " + filaComum.dequeue() + ", cliente comum");
                                filaTempoComum.dequeue();
                            } else {
                                write("\nPode entrar " + filaVip.dequeue() + ", cliente VIP");
                            }

                        } else {
                            write("\nPode entrar " + filaVip.dequeue() + ", cliente VIP");
                        }

                    } else {
                        write("\nPode entrar " + filaComum.dequeue() + ", cliente comum");
                        filaTempoComum.dequeue();
                    }
                    break;

                case '0':
                    break;

                default:
                    System.out.println("\nOpção inválida");
                    break;
            }


        } while (opcao != '0');

    }

    public static void write(Object text) {
        System.out.println(text);
    }
}
