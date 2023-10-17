package Senac.estruturaDeDados.pilhaEstatica;

import java.util.Scanner;

public class Verificacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pilha pilha = new Pilha(50);
        boolean error = false;

        System.out.println("Informe a expressão");
        String expressao = input.nextLine();

        for(int i = 0; i< expressao.length();i++){
            char char01, char02;
            char01 = expressao.charAt(i);

            switch (char01){
                case '(':
                case '[':
                case '{':
                    pilha.push(char01);
                    break;

                case ')':
                case ']':
                case '}':
                    if(!pilha.isEmpty()){
                        char02 = pilha.pop();
                        if(char01==')' && char02=='(' ||
                                char01==']' && char02=='[' ||
                                char01=='}' && char02=='{' ){
                        }
                        else{
                            System.out.println("Expressao esta errada na posicao "+i);
                            error = true;
                        }
                    }
                    else{
                        System.out.println("A expressao esta incorreta na posicao "+i);
                        error = true;
                    }
                    break;
            }

            if(error)
                break;
        }
        if(!error){
            System.out.println("A EXPRESSAO ESTA CORRETA");
        }
    }
}