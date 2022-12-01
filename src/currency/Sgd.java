package currency;

public class Sgd {
    final double currency = 0.000087;

    public double getCurrency() {
        return currency;
    }

    public double toSgd(double idr) {
        return idr * currency;
    }

    public double fromSgd(double sgd) {
        return sgd / currency;
    }
}
