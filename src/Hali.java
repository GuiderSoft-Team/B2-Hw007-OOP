public class Hali {
    private double fiyat;

    public Hali() {
    }

    public Hali(double fiyat) {
        this.fiyat = fiyat;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        if (fiyat<0)return;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return String.format("Birim fiyati : %5.2f ",fiyat);
    }
}
