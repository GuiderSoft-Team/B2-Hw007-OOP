public class Zemin {

    public String aciklama;
    public double genislik;
    public double uzunluk;

    public Zemin() {
    }

    public Zemin(String aciklama, double genislik, double uzunluk){
        this.aciklama = aciklama;
        this.genislik = genislik;
        this.uzunluk = uzunluk;
    }

    public double alanHesapla() {
        return getGenislik()*getUzunluk();
    }

    @Override
    public String toString() {
        return String.format("%s,(%5.0f,\"x\",%5.0f)" + aciklama, genislik, uzunluk);
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getGenislik() {
        if (genislik < 0) {
            genislik = 0;

        }
        return genislik;
    }
    public void setGenislik (double genislik) {
        this.genislik = genislik;
    }

    public double getUzunluk() {
        if(uzunluk<0){ uzunluk=0;
    }
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
}
}

