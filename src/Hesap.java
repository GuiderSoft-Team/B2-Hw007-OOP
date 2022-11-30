public class Hesap {

    Zemin zemin=new Zemin();
    Hali hali=new Hali();

    public Hesap() {
    }

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
        return hali.getFiyat()*zemin.alanhesapla();
    }


    @Override
    public String toString() {
        return "Hesap :"+getToplamMaliyet();


    }
}
