public class Zemin {
    private String aciklama;
    private double genislik;
    private double uzunluk;

    public Zemin() {
    }

    public Zemin(double genislik, double uzunluk) {
        setGenislik(genislik);
        setUzunluk(uzunluk);
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
            this.genislik = 0;
        }else {
            this.genislik = genislik;
        }
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if (uzunluk < 0) {
            this.uzunluk = 0;
        } else {
            this.uzunluk = uzunluk;
        }
    }
    public double alanHesapla(){
        return genislik*uzunluk;
    }

    @Override
    public String toString() {
        return String.format("%s(%5.2f x %5.2f)",aciklama,genislik,uzunluk);
    }
}
