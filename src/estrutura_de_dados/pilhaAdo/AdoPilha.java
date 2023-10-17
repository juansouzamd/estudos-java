package estrutura_de_dados.pilhaAdo;
import java.util.Scanner;

public class AdoPilha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pilha pilha = new Pilha(50);


        System.out.println("Informe a expressão:");
        String expressao = input.nextLine();

        for(int i = 0; i < expressao.length(); i++){

            switch(expressao.charAt(i)){

                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    System.out.print(expressao.charAt(i)+ " ");
                    break;

                case '+':
                case '*':
                case '-':
                case '/':
                case '(':
                    pilha.push(expressao.charAt(i));
                    break;

                case ')':
                    while(!pilha.isEmpty()){
                        if(pilha.peek() != '('){
                            System.out.print(pilha.pop() + " ");
                        } else {
                            pilha.pop();
                        }
                    }
                    break;
            }
        }

        while(!pilha.isEmpty()){
            System.out.print(pilha.pop() + " ");
        }
    }
}