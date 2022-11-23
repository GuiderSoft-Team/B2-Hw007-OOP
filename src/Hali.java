public class Hali {

    double fiyat;

    public Hali() {
    }

    public Hali(double fiyat) {
        this.fiyat = fiyat;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        if (fiyat<0){
            this.fiyat = fiyat;
        }else
            this.fiyat=0;

    }

    @Override
    public String toString() {
        return "Hali{" +
                "Birim fiyat=" + fiyat +
                '}';
    }
}

