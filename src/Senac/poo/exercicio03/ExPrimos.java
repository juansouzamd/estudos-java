package Senac.poo.exercicio03;

public class ExPrimos {

    public String ehPrimo(int numero){
        String primo = "";
        int cont = 0;

        for(int i = 1; i <= numero; i++){
            if(numero%i == 0){
                cont++;
            }
        }

        if(cont == 2){
            primo = "É um numero primo";
        } else {
            primo = "Não é um número primo";
        }

        return primo;
    }
}
