public class Zemin {
   private String aciklama;
  private   double genislik;
   private double uzunluk;

    public Zemin() {
    }

    public Zemin(double genislik, double uzunluk) {
        this.genislik = genislik;
        this.uzunluk = uzunluk;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        if(genislik>0){
            this.genislik = genislik;
        }else{
            this.genislik=0;
        }

    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if (uzunluk>0){
            this.uzunluk = uzunluk;
        }else{
            this.genislik=0;
        }


    }
    public  double alanHesapla(){
        return genislik*uzunluk;
    }

    @Override
    public String toString() {
        return String.format("aciklama: %s genislik:%5.2f uzunluk:5.2f",aciklama,genislik,uzunluk);
    }
}
