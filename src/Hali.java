public class Hali {
    private double fiyat;

    public Hali() {
    }

    public Hali(double fiyat) {
        setFiyat(fiyat);
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        if (fiyat<0){
            this.fiyat=0;
        }else {
        this.fiyat = fiyat;}
    }
  /* public double getFiyat (){
        return fiyat;
    }*/

    @Override
    public String toString() {
        return String.format("Birim Fiyatı:%f",fiyat);
    }
}
