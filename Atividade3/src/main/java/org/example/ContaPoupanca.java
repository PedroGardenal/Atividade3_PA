package org.example;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double sacar(double valor){
        if(saldo>valor){
            this.saldo = this.saldo-valor;
        }else{
            System.out.println("Você não tem saldo o suficiente, seu saldo é de:"+saldo);
        }
        return 0;
    }
}
