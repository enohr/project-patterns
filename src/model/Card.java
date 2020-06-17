package model;

import java.util.Date;

public class Card {

    private boolean type;
    private String cardCode;
    private String securityCode;
    private Date date;
    private double total;

    public Card(boolean type, String cardCode, String securityCode, Date date){
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
