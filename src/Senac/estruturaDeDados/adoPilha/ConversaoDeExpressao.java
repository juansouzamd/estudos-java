package Senac.estruturaDeDados.adoPilha;

import java.util.Scanner;

public class ConversaoDeExpressao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pilha pilha = new Pilha(50);


        System.out.println("Informe a expressão:");
        String expressao = input.nextLine();

        char char01;

        for(int i = 0; i < expressao.length(); i++){
            char01 = expressao.charAt(i);

            switch(char01){

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
                    System.out.print(char01+ " ");
                    break;

                case '+':
                case '*':
                case '-':
                case '/':
                    pilha.push(char01);
                    break;
            }
        }

        while(!pilha.isEmpty()){
            System.out.print(pilha.pop() + " ");
        }
    }
}
