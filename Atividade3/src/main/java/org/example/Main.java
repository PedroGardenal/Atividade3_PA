package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ContaCorrente contaCorrente = new ContaCorrente(123, "Jair",10000,200);
    ContaPoupanca contaPoupanca = new ContaPoupanca(1233, "Paulo", 500);
    ContaInvestimento contaInvestimento = new ContaInvestimento(50, "Jonas", 3000);
    ContaSalario contaSalario = new ContaSalario(12345, "James",100,50);
    ContaInvestimentoAltoRisco contaInvestimentoAltoRisco = new ContaInvestimentoAltoRisco(000,"JansenTerra", 740);

    contaCorrente.sacar(150);
    contaPoupanca.sacar(40);
    contaInvestimento.sacar(600);
    contaSalario.sacar(900);
    contaInvestimentoAltoRisco.sacar(50000);

        System.out.println("\n");
    contaCorrente.exibirInformacoes();
        System.out.println("\n");
    contaPoupanca.exibirInformacoes();
        System.out.println("\n");
    contaInvestimento.exibirInformacoes();
        System.out.println("\n");
    contaSalario.exibirInformacoes();
        System.out.println("\n");
    contaInvestimentoAltoRisco.exibirInformacoes();
        }
    }