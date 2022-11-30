public class Zemin {
    public String aciklama;
    public double genislik;
    public double uzunluk;

    public double alanHesapla(){
        return getUzunluk()*getGenislik();
    }

    public Zemin() {
    }

    @Override
    public String toString() {
        return "Zemin{" +
                "aciklama='" + aciklama + '\'' +
                ", genislik=" + genislik +
                ", uzunluk=" + uzunluk +
                '}';
    }
    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getGenislik() {
        if (genislik<0){
            genislik=0;
        }
        return genislik;
    }
    public void setGenislik(double genislik) {
        this.genislik = genislik;
        if (genislik<0){
            genislik=0;
        }
    }
    public double getUzunluk() {
        if (uzunluk<0){
            uzunluk=0;
        }
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public Zemin(String aciklama, double genislik, double uzunluk) {
        this.aciklama = aciklama;
        this.genislik = genislik;
        this.uzunluk = uzunluk;

    }
}
