package Senac.estruturaDeDados.pilhaEstatica;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(100);
        boolean erro = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a expressao");
        String expressao = in.nextLine();

        for(int i=0; i<expressao.length(); i++){
            char char1, char2;
            char1 = expressao.charAt(i);

            switch(char1){
                case '(':
                case '[':
                case '{':
                    pilha.push(char1);
                    break;

                case ')':
                case ']':
                case '}':
                    if(!pilha.isEmpty()){
                        char2 = pilha.pop();
                        if(char1==')' && char2=='(' ||
                            char1==']' && char2=='[' ||
                            char1=='}' && char2=='{' ){
                        }
                        else{
                            System.out.println("Expressao esta errada na posicao "+i);
                            erro = true;
                        }
                    }
                    else{
                        System.out.println("A expressao esta incorreta na posicao "+i);
                        erro = true;
                    }
                    break;
            }

            if(erro)
                break;
        }
        if(!erro){
            System.out.println("A EXPRESSAO ESTA CORRETA");
        }
    }
}
