public class Zemin {
   private     String  aciklama ;
   private double genislik;
   private double uzunluk;

    public Zemin() {
    }

    public Zemin(String aciklama, double genislik, double uzunluk) {
        this.aciklama = aciklama;
        this.genislik = genislik;
        this.uzunluk = uzunluk;
    }

    public Zemin(double genislik, double uzunluk) {
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
        if (genislik<0){
            this.genislik = genislik;
        }else
            this.genislik=0;

    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if (uzunluk>0){
            this.uzunluk=uzunluk;
        }else
            this.uzunluk=0;

    }
    public double alanHesapla(){
        return genislik*uzunluk;
    }

    @Override
    public String toString( ) {

        return String.format("%s (%5.2f*%5.2f)",aciklama,genislik,uzunluk);


    }


}


