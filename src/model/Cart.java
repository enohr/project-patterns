package model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Cart implements Observer {

    private double total = 0;
    ArrayList<Product> data = new ArrayList<>();

    public Cart() {
        data.clear();
    }

    @Override
    public void update(Observable o, Object arg) {
        Product p = (Product) o;
        System.out.println(p);
        this.total = p.getValue();
        data.add(p);
        System.out.println(getCartContent().toString());
    }

    public ArrayList<Product> getCartContent() {
        return data;
    }

    public double getTotalPrice() {
        return this.total;
    }
}
