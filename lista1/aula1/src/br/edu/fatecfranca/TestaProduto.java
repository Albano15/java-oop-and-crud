package br.edu.fatecfranca;

import br.edu.fatecfranca.teste.Produto;

public class TestaProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setDescricao("Mesa");
        produto1.setPreco(573.65f);
        produto1.subir(26.35f);

        produto1.setQuantidade(5);
        produto1.comprar(2);
        produto1.vender(4);

        produto1.setId(2);
        produto1.mostra();

        System.out.println("-------------------------------------------------------------------------");

        Produto produto2 = new Produto();
        produto2.setDescricao("Cadeira");
        produto2.setPreco(225.34f);
        produto2.subir(26.35f);

        produto2.setQuantidade(12);
        produto2.comprar(2);
        produto2.vender(4);

        produto2.setId(4);

        produto2.mostra();
    }
}
