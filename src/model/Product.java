package model;

import java.util.Observable;

public class Product extends Observable {
    private double value;
    private String name;

    public Product(double value, String name) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public double getValue() {
        setChanged();
        notifyObservers();
        return this.value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
