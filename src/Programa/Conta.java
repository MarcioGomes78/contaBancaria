package Programa;

import utilities.Utils;

public class Conta {

    private static int contadorDeContas = 1;
    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    public Conta() {
    }

    public Conta( Pessoa pessoa) {
        this.numeroConta =contadorDeContas;
        this.pessoa = pessoa;
        contadorDeContas += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", pessoa=" + pessoa +
                ", saldo=" + saldo +
                '}';
    }
}
