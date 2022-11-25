public class Hesap {
    Zemin zemin;

    Hali hali;

    public Hesap() {
    }

    public Hesap(Zemin zemin, Hali hali) {
        this.zemin = zemin;
        this.hali = hali;
    }

    public double getToplamMaliyet() {
        return zemin.alanHesapla() * hali.fiyat;
    }


    @Override
    public String toString() {
        return String.format("Toplam maliyet: %5.2f", getToplamMaliyet());
    }
}
