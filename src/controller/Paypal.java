package controller;

import model.Strategy;

public class Paypal implements Strategy {
    @Override
    public boolean payment(double value) {
        return false;
    }
}
