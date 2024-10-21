import br.edu.fatecfranca.exe0.Compra;

public class TestaCompra {
    public static void main(String[] args) {

        Compra obj1 = new Compra(200,2,"aprovado");
        System.out.println(obj1);

        Compra obj2 = new Compra();
        obj2.setValor(-10.3f);
        obj2.setQuantidade(-150);
        obj2.setSituacao("Bugada");
        System.out.println(obj2);

        Compra obj3 = new Compra();
        obj3.setValor(10.3f);
        obj3.setQuantidade(150);
        obj3.setSituacao("Reprovado");
        System.out.println(obj3);


    }
}