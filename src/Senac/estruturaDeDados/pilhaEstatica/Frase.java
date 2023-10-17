package Senac.estruturaDeDados.pilhaEstatica;

import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pilha pilha = new Pilha(50);

        System.out.println("Informe uma frase:");
        String frase = input.next();

        for(int i = 0; i < frase.length();i++){
            pilha.push(frase.charAt(i));
        }

        while (!pilha.isEmpty()){
            System.out.print(pilha.pop());
        }

    }
}
