package br.edu.fatecfranca.teste;

public class Produto {
    public String descricao;
    public int id, quantidade;
    public float preco;

    public Produto() {
        // Construtor vazio
    }

    public Produto(String descricao, int id, int quantidade, float preco) {
        this.descricao = descricao;
        this.id = id;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Métodos setters
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void comprar(int qtd) {
        this.quantidade += qtd;
        System.out.println("O Estoque atual do produto " + this.descricao + " é: " + this.quantidade);
    }

    public void vender(int qtd) {
        this.quantidade -= qtd;
        System.out.println("O Estoque atual do produto " + this.descricao + " é: " + this.quantidade);
    }

    public void subir(float preco) {
        this.preco += preco;
        System.out.println("O preço atual do produto " + this.descricao + " é: " + this.preco);
    }

    public void descer(float preco) {
        this.preco -= preco;
        System.out.println("O preço atual do produto " + this.descricao + " é: " + this.preco);
    }

    public void mostra() {
        System.out.println("Produto: " + this.descricao + ", Estoque atual do produto: " + this.quantidade + ", Preço Atual: " + this.preco);
    }
}
