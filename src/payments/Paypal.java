package payments;

import interfaces.Strategy;

public class Paypal implements Strategy {
    @Override
    public boolean payment(double value) {
        return false;
    }
}
