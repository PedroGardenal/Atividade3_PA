package org.example;

public class ContaInvestimentoAltoRisco extends ContaInvestimento{

    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double sacar(double valor) {

        if (valor > 9999) {
            if (saldo*0.05  > valor) {
                this.saldo = saldo - valor;
            } else {
                System.out.println("Você tem de saldo: " + saldo + " com uma taxa de: "+valor*0.05);
            }
            return 0;
        }else{
            System.out.println("Saque minimo de: 10.000 Réis Réis");
        }
        return 0;
    }
}
