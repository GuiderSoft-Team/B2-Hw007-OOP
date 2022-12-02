public class Hali {
    private double fiyat;

    public Hali(double fiyat) {
        if(fiyat<0) fiyat=0;
        this.fiyat = fiyat;
    }

    public double getFiyat(){
        return fiyat;
    }

    @Override
    public String toString() {
        return String.format("Birim fiyatı: %5.2f",fiyat);
    }
}
