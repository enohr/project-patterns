import interfaces.Strategy;
import model.Cart;
import model.Factory;
import model.Product;
import java.util.Scanner;

public class Facade {

    // Fachada

    private Product p1, p2, p3;
    private final Scanner input = new Scanner(System.in);
    private Strategy str;
    Cart c;

    public Facade() {
        p1 = new Product(10, "Bala");
        p2 = new Product(20, "Lapis");
        p3 = new Product(30, "Borracha");

        // Singleton
        if (c == null) {
            c = new Cart(p1, p2, p3);
        }
    }


    public void buy() {
        String in = "";

        while (!in.equals("0")) {

            System.out.println("Seja bem vindo ao mercado.\nEscolha um dos produtos abaixo e digite 0 para finalizar sua compra.");
            System.out.println("1 - " + p1.getName());
            System.out.println("2 - " + p2.getName());
            System.out.println("3 - " + p3.getName());
            System.out.println("0 - Finalizar compra");

            in = input.nextLine();

            switch(in) {
                case "1":
                    c.setTotalPrice(p1.getValue());
                    break;
                case "2":
                    c.setTotalPrice(p3.getValue());
                    break;
                case "3":
                    c.setTotalPrice(p2.getValue());
                    break;
            }

            System.out.println("O seu carrinho contém os seguintes itens: " + c.getCartContent().toString());

        }

        System.out.println("O Valor total é de " + c.getTotalPrice() + ". Qual a forma de pagamento deseja utilizar?");
        System.out.println("1 - Paypal");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Cartão de Débito");

        System.out.println("0 - Encerrar.");

        in = input.nextLine();
        if (in.equals("0")) System.exit(0);
        Factory f = new Factory();
        str = f.chooseStrategy(in);
        if (str == null) System.exit(0);

        boolean success = str.payment(c.getTotalPrice());

        if (success) {
            System.out.println("Compra efetuada com sucesso!");
        } else {
            System.out.println("Algo deu errado! Volte novamente mais tarde!");
        }

    }
}
