public class Hesap {
    Zemin zemin = new Zemin();

    Hali hali = new Hali();

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
