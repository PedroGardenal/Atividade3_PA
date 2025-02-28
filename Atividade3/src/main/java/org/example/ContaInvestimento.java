package org.example;

public class ContaInvestimento extends ContaBancaria{

    public ContaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double sacar(double valor) {
        if(saldo+((saldo/100)*2)>valor){
            this.saldo = saldo-valor;
        }else{
            System.out.println("Você tem de saldo: "+saldo);
            System.out.println("Sua retirada com 2% de juros é de: "+valor*0.02);
        }
        return 0;

    }
}
