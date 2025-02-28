package org.example;

public class ContaCorrente extends ContaBancaria{
    double chequeEspecial;
    int x;

    public ContaCorrente(int numeroConta, String titular, double saldo, double chequeEspecial) {
        super(numeroConta, titular, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override

    public double sacar(double valor){
        if(saldo+chequeEspecial>valor){
            saldo = (saldo+chequeEspecial)-valor;
        }else{
            System.out.println("Você tem de saldo: "+saldo);
            System.out.println("Seu cheque especial é de: "+chequeEspecial);
            System.out.println("Você não tem limite o suficiente, seu limite é de: "+(saldo+chequeEspecial));
        }
        return 0;
    }




}
