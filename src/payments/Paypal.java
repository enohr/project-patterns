package payments;

import java.util.Scanner;
import interfaces.Strategy;


public class Paypal implements Strategy {
    private final Scanner input = new Scanner(System.in);


    @Override
    public boolean payment(double value) {

        System.out.println("Informe seu nome completo");
        String name = input.nextLine();
        System.out.println("Informe o seu CPF");
        String cpf = input.nextLine();
        System.out.println("Informe a sua senha");
        String pass = input.nextLine();

        System.out.println("Efetuando o pagamento do usuário " + name + " no valor de " + value + " utilizando PayPal. Obrigado");
        return true;
    }
}
