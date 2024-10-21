package br.edu.fatecfranca;

import br.edu.fatecfranca.teste.Cliente;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(10, 11, "Fulano", 11500.53f);

        cliente1.realizarDeposito(201.3f);
        cliente1.realizarSaque(701.83f);

        System.out.println(cliente1.toString());

        Cliente cliente2 = new Cliente(20, 21, "Beltrano", 11500.53f);

        cliente2.realizarDeposito(20.3f);
        cliente2.realizarSaque(70.83f);

        System.out.println(cliente2.toString());
    }
}
