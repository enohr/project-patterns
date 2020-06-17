package model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Cart implements Observer {

    private double total = 0;
    ArrayList<Product> data = new ArrayList<>();
    private Observable obs1, obs2, obs3;

    public Cart(Observable obs1, Observable obs2, Observable obs3) {
        this.obs1 = obs1;
        this.obs2 = obs2;
        this.obs3 = obs3;
        obs1.addObserver(this);
        obs2.addObserver(this);
        obs3.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("AAAAAAAAAA");
        Product p = (Product) o;
        System.out.println(p);
        data.add(p);
        System.out.println(getCartContent().toString());
    }

    public ArrayList<Product> getCartContent() {
        return data;
    }

    public double getTotalPrice() {
        return this.total;
    }

    public void setTotalPrice(double value) {
        this.total += value;
    }
}
