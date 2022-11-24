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
        return zemin.alanHesapla()*hali.getFiyat();
    }

    @Override
    public String toString() {
        return "Hesap :" +getToplamMaliyet();
    }
}



