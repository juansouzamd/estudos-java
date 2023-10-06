package com.junit;

public class Conta {
    private String name;
    private Double saldo;

    public Conta(String name, Double saldo) {
        this.name = name;
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
