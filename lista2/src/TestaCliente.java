import br.edu.fatecfranca.exe1.Cliente;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Fatec");
        cliente1.setNumeroAgencia("1234-6");
        cliente1.setNumeroConta("123415-6");
        cliente1.depositar(102.4f);
        cliente1.sacar(15.4f);
        System.out.println(cliente1.toString());

        Cliente cliente2 = new Cliente("123456-7", 2000f, "João", "35545-45");

        cliente2.depositar(1000f);
        cliente2.sacar(4000f);
        System.out.println(cliente2.toString());
    }
}
