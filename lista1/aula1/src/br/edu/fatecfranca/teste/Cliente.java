package br.edu.fatecfranca.teste;

public class Cliente {
    private int numeroConta, numeroAgencia;
    private String nome;
    private float saldo;

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void realizarSaque(float valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido: saldo insuficiente ou valor negativo.");
        }
    }

    public void realizarDeposito(float valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Depósito inválido: valor negativo.");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroConta=" + numeroConta +
                ", numeroAgencia=" + numeroAgencia +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
