public class Hali {
    public double fiyat;

    public Hali(double fiyat) {
        this.fiyat = fiyat;
    }

    public double getFiyat() {
        if (fiyat<0){
            fiyat=0;
        }
        return fiyat;
    }

    public void setFiyat(double fiyat) {

        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Hali{" +
                "fiyat=" + fiyat +
                '}';
    }
}
