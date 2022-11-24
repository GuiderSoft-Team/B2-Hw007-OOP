public class Zemin extends Hesap {


    private String aciklama;
    private double genislik;
    private double uzunluk;


    public Zemin(String s, double v1) {

    }

    public Zemin(String adi, double genislik, double uzunluk) {
        this.aciklama = aciklama;
        this.genislik = 4.0;
        this.uzunluk = 2.75;
    }

   

    public Zemin() {

    }

    public Zemin(double v, double v1) {
    }


    public String getAdi() {
        return aciklama;
    }

    public void setAdi(String adi) {
        this.aciklama = adi;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        if (genislik > 0) {
            this.genislik = genislik;
        } else
            this.genislik = 0;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if (uzunluk < 0) {
            this.uzunluk = uzunluk;
      } else
            this.uzunluk = 0;
    }

    public double alanHesapla() {
        return genislik * uzunluk;
    }


    @Override
    public String toString() {
        return String.format("%s,(%5.2f*%5.2f)"+aciklama,genislik,uzunluk);



    }
}


