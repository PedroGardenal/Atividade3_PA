package org.example;

public abstract class ContaBancaria {
    int numeroConta;
    String titular;
    double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo = saldo + valor;
    }

    public abstract double sacar(double valor);


    public void exibirInformacoes(){
        System.out.println("Numero da Conta: "+ numeroConta);
        System.out.println("Titular: "+ titular);
        System.out.println("Saldo: "+ saldo);
    }



}
