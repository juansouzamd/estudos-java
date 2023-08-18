package estrutura_de_dados.recursividade;

public class Fatorial {
    public static void main(String[] args) {

        int num = 5;

        int resultado = fatorial(num);

        System.out.println(resultado);

    }

    public static int fatorial(int num){

        if(num == 0){
            return 1;
        }

        return num * fatorial(num-1);
    }
}
