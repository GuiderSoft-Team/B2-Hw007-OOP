public class Hali {
    public double fiyat=0;

    public Hali() {
    }

    public Hali(double fiyat) {
        setFiyat(fiyat);
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        if (fiyat<0) return;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return String.format("Birim Fiyat: %5.2f",fiyat);
    }
}
