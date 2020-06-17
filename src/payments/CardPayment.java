package payments;

import interfaces.Strategy;
import model.Card;

import java.util.Date;
import java.util.Scanner;

public class CardPayment implements Strategy{

    private final Scanner input = new Scanner(System.in);
    private Card card;
    private boolean type;

    public CardPayment(boolean type){
        this.type = type;
    }

    @Override
    public boolean payment(double value) {

        System.out.println("Informe o número do cartão");
        String cardCode = input.nextLine();
        System.out.println("Informe o código de segurança do cartão");
        String securityCode = input.nextLine();
        System.out.println("Informe a data de validade do cartão");
        String date = input.nextLine();

        card = new Card(type, cardCode, securityCode, new Date(date));

        if (value > card.getTotal() && type) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        return true;
    }
}
