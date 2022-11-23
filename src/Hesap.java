public class Hesap {
    private Zemin zemin;
    private Hali hali;

    public Hesap() {
    }

    public Hesap(Zemin zemin, Hali hali) {
        this.zemin = zemin;
        this.hali = hali;
    }
    double getToplamMaliyet(){

        return zemin.alanHesapla()*hali.getFiyat();
    }

    @Override
    public String toString() {
        return String.format("toplam maliyet:%5.2f",getToplamMaliyet());
    }
}
