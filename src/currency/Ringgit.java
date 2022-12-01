package currency;

public class Ringgit {
    final double currency = 0.00028;

    public double getCurrency() {
        return currency;
    }

    public double toRinggit(double idr) {
        return idr * currency;
    }

    public double fromRinggit(double ringgit) {
        return ringgit * currency;
    }
}
