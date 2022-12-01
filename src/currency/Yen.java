package currency;

public class Yen {
    final double currency = 0.0089;

    public double getCurrency() {
        return currency;
    }

    public double toYen(double idr) {
        return idr * currency;
    }

    public double fromYen(double yen) {
        return yen / currency;
    }
}
