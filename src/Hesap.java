public class Hesap {

    private double hali;
    private double zemin;

    public Hesap() {
    }

    public Hesap(double hali, double zemin) {
        this.hali = hali;
        this.zemin = zemin;
    }

    public Hesap(Zemin zemin, Hali hali) {
    }


    public double getHali() {
        return hali;
    }

    public void setHali() {
        this.hali = hali;
    }

    public double getZemin() {
        return zemin;
    }

    public void setZemin() {
        this.zemin = zemin;
    }

    public  double getToplamMaliyet(){
        return getHali()*getZemin();
        }

    @Override
    public String toString() {
        return String.format("Toplam Maliyet"+getToplamMaliyet());
    }
}
