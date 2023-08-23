package Senac.poo.exercicio01;

public class ContaEspecial extends ContaCorrente{

    @Override
    public void sacar(double valor){
       setSaldo(getSaldo() - (valor + (valor*0.01)));
    }
}
