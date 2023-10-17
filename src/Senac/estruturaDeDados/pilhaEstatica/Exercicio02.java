package Senac.estruturaDeDados.pilhaEstatica;

import java.util.Scanner;

public class Exercicio02{

    public static void main(String[] args) {
        Pilha p = new Pilha(100);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite:");
        String frase = entrada.nextLine();

        System.out.println("A frase digitada foi: "+frase);
        for(int i=0; i<frase.length();i++){
            p.push(frase.charAt(i));
        }

        while(!p.isEmpty()){
            System.out.print(p.pop());
        }
        System.out.println('\n');
    }
}
