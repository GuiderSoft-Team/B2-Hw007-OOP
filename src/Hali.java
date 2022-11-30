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
        if (fiyat<0){
            fiyat=0;
        }else {
            this.fiyat = fiyat;
        }
    }


    @Override
    public String toString() {
        return "Hali{" +
                "Birim fiyati=" + fiyat +
                '}';
    }
}
