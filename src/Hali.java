public class Hali {
    private double fiyat;

    public Hali() {
    }

    public Hali(double fiyat) {
        if (fiyat<0){
            this.fiyat = fiyat;
        }else {
            this.fiyat=fiyat;
        }
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return String.format("Birim fiyatı %5.2f: ",fiyat);
    }
}
