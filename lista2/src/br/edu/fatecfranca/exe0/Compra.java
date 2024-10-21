package br.edu.fatecfranca.exe0;

public class Compra {
    private float valor;
    private int quantidade;
    private String situacao;

    public Compra() {

    }

    public Compra(float valor, int quantidade, String situacao) {
        this.valor = valor;
        this.quantidade = quantidade;
        this.situacao = situacao;
    }

    public void setValor(float valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            System.out.println("Valor Inválido");
            this.valor = 0;
        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade não pode ser negativa");
            this.quantidade = 0;
        }
    }

    public void setSituacao(String situacao) {
        if(situacao.equals("Aprovado") || situacao.equals("Reprovado") || situacao.equals("Pendente")) {
            this.situacao = situacao;
        } else {
            System.out.println("Situação Inválida");
            this.situacao = "Reprovado";
        }
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "valor=" + valor +
                ", quantidade=" + quantidade +
                ", situacao='" + situacao + '\'' +
                '}';
    }

    public float getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getSituacao() {
        return situacao;
    }
}
