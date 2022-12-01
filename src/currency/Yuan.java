package currency;

public class Yuan {
    final double currency = 0.00045;

    public double getCurrency() {
        return currency;
    }

    public double toYuan(double idr) {
        return idr * currency;
    }

    public double fromYuan(double yuan) {
        return yuan / currency;
    }
}
