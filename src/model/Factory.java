package model;

import interfaces.Strategy;
import payments.CardPayment;
import payments.Paypal;

public class Factory{
    public Strategy chooseStrategy (String choice) {
        Strategy str;
        switch(choice) {
            case "1":
                str = new Paypal();
                break;
            case "2":
                str = new CardPayment(false);
                break;
            case "3":
                str = new CardPayment(true);
                break;
            default:
                str = null;
        }
        return str;
    }
}
