package org.example;

public class ContaSalario extends ContaCorrente {

    int x;

    public ContaSalario(int numeroConta, String titular, double saldo, double chequeEspecial) {
        super(numeroConta, titular, saldo, chequeEspecial);
    }

    @Override
    public double sacar(double valor) {
        if(x==0) {
            if (saldo > valor) {
                this.saldo = this.saldo - valor;
            } else {
                System.out.println("Você não tem saldo o suficiente, seu saldo é de:" + saldo);
            }
            this.x = x + 1;
        }else{
            if (saldo+5 > valor) {
                saldo = saldo+(5) - valor;
            } else {
                System.out.println("Você não tem saldo o suficiente, seu saldo é de: " + saldo+ " e você tem "+(5)+" de taxa");
            }
        }
        return x+1;
    }

}
