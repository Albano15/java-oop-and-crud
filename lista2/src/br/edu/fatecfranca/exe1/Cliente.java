package br.edu.fatecfranca.exe1;

public class Cliente {
    private String numeroConta;
    private float saldo;
    private String nome;
    private String numeroAgencia;

    public Cliente() {
        this.numeroConta = "Não Definido";
        this.saldo = 0;
        this.nome = "Não Definido";
        this.numeroAgencia = "Não Definido";
    }

    public Cliente(String numeroConta, float saldo, String nome, String numeroAgencia) {
        this.setNumeroConta(numeroConta);
        this.setSaldo(saldo);
        this.setNome(nome);
        this.setNumeroAgencia(numeroAgencia);
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8){
            if (numeroConta.charAt(6) == '-'){
                this.numeroConta = numeroConta;
            } else {
                System.out.println("Traço incorreto");
                this.numeroConta = "";
            }
        } else {
            System.out.println("Tamanho diferente de 8");
        }
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length() == 6){
            if (numeroAgencia.charAt(4) == '-'){
                this.numeroAgencia = numeroAgencia;
            } else {
                this.numeroAgencia = "";
                System.out.println("Traço incorreto");
            }
        } else {
            System.out.println("Tamanho diferente de 6");
        }
    }

    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        } else {
            this.nome = "";
            System.out.println("O número máximo de carateres é 30");
        }
    }

    public void setSaldo(float saldo) {
        if (saldo < 0){
            System.out.println("Operação não permitida");
        } else {
            this.saldo = saldo;
        }
    }

    public void depositar(float valor) {
        this.setSaldo(this.saldo + valor);
    }

    public void sacar(float valor) {
        this.setSaldo(this.saldo - valor);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                ", nome='" + nome + '\'' +
                ", numeroAgencia='" + numeroAgencia + '\'' +
                '}';
    }

}
