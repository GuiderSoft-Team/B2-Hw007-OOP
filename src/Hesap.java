public class Hesap {
    public Zemin zemin;
    public Hali hali;

    public Hesap(Zemin zemin, Hali hali) {
        this.zemin = zemin;
        this.hali = hali;
    }
    public Zemin getZemin() {
        return zemin;
    }
    public void setZemin(Zemin zemin) {
        this.zemin = zemin;
    }

    public Hali getHali() {
        return hali;
    }

    public void setHali(Hali hali) {
        this.hali = hali;
    }
    public double getToplamMaliyet(){
        return zemin.alanHesapla()* hali.getFiyat();
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "zemin=" + zemin +
                ", hali=" + hali +
                '}';
    }
}
