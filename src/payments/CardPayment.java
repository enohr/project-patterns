package payments;

import interfaces.Strategy;
import model.Card;

import java.time.LocalDate;
import java.util.Scanner;

public class CardPayment implements Strategy{

    private final Scanner input = new Scanner(System.in);
    private Card card;
    private boolean type;
    LocalDate data = null;

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
        validateDate(date);

        card = new Card(type, cardCode, securityCode, data);

        if (value > card.getTotal() && type) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        return true;
    }

    private void validateDate(String date) {
        try {
            data = LocalDate.parse(date);

        } catch (Exception e) {
            System.out.println("A Data informada não é valida;");
            System.exit(0);
        }
    }
}
