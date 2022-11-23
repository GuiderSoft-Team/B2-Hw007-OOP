public class Zemin {
    private double genislik;
    private double uzunluk;
    private String aciklama;

    public Zemin() {
    }

    public Zemin(double genislik, double uzunluk, String aciklama) {
        this.genislik = genislik;
        this.uzunluk = uzunluk;
        this.aciklama = aciklama;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        if (genislik<0)return;
        this.genislik = genislik;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if (uzunluk<0)return;
        this.uzunluk = uzunluk;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
    public double alanHesapla(){
        return genislik*uzunluk;
    }

    @Override
    public String toString() {
        return String.format("halinin genişliği %5.2f ve uzunluğu %5.2f dir.",genislik,uzunluk);
    }
}
