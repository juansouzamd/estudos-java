package treino.stream_api;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(9);
        list.add(48);
        list.add(36);
        list.add(120);
        list.add(31);
        list.add(2);
        list.add(74);
        list.add(17);


        //Imprimir lista
        list.forEach(numero -> System.out.print(numero + " "));

        System.out.println();

        //Imprimir pares
        list.forEach(numero -> {if(numero % 2 == 0){
            System.out.print(numero + " ");
        }});

        System.out.println();

        //Soma de todos os numeros
        //int soma = list.stream().reduce(0, (n1, n2) -> n1 + n2);
        int soma = list.stream().reduce(0, Integer::sum);
        System.out.println("Soma de todos: " + soma);

        System.out.println();

        //Lista com números dobrados
        List<Integer> listaDobrados = list.stream().map(n -> n*2).toList();
        listaDobrados.forEach(numero -> System.out.print(numero + " "));

        System.out.println();
        System.out.println();

        //Imprimir os maiores que 40
        list.stream().filter(n -> n>40).forEach( x -> System.out.print(x + " "));


    }
}
