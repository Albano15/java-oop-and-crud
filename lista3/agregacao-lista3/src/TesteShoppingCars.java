import br.edu.fatecfranca.exe0.Product;
import br.edu.fatecfranca.exe0.ShoppingCart;

import java.util.Date;

public class TesteShoppingCars {
    public static void main(String[] args) {
        Product prod1 = new Product(1, "Bola de Basquete", 400);
        Product prod2 = new Product(2, "Bola de Futebol", 300);
        Product prod3 = new Product(3, "Bola de Vôlei", 200);

        ShoppingCart cart1 = new ShoppingCart(100, new Date(), "Franca", "PIX", 0);
        cart1.addCarItem(10, 2, prod1);
        cart1.calculateTotalPrice();
        System.out.println(cart1);
    }
}
