package br.com.vita.academy.javaobjeto.dto.Conta;

public class ContaBancaria {
    private String titular;
    private Double saldo;
    private String numeroConta;

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void sacar(Double valor){
        this.saldo -= valor;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

}
