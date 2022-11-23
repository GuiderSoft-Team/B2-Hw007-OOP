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
        if (fiyat>0)
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return String.format("%5.2f",fiyat);
    }
            }

