package model;

import java.time.LocalDate;

public class Card {

    private boolean type;
    private String cardCode;
    private String securityCode;
    private LocalDate date;
    private double total;

    public Card(boolean type, String cardCode, String securityCode, LocalDate date){
        this.total = 2000;
        this.type = type;
        this.cardCode = cardCode;
        this.securityCode = securityCode;
        this.date = date;
    }


    public double getTotal() {
        return total;
    }

}
