public class Hali {
    double fiyat;

    public Hali() {

    }

    public Hali(double fiyat) {
        if (fiyat < 0) fiyat = 0;
        this.fiyat = fiyat;
    }

    public double getFiyat() {
        return fiyat;
    }


    @Override
    public String toString() {
        return "Hali: {" + "Birim fiyati=" + fiyat + '}';
    }
}
