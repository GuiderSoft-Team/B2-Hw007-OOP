public class Hali {
    private double fiyat;

    public Hali(double fiyat) throws LengthException {
        setFiyat(fiyat);
    }

    public Hali() {
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) throws LengthException {
        if (fiyat <= 0) throw new LengthException("Fiyat pozitif olmali!");
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return String.format("Birim fiyati : %5.2f", fiyat);
    }
}
