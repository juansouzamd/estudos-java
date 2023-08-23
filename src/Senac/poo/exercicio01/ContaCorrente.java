package Senac.poo.exercicio01;

public class ContaCorrente {
    private double saldo;
    private String nome;
    private String cpf;

    public ContaCorrente() {
    }

    public ContaCorrente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= (valor + (valor*0.05));
    }

}
