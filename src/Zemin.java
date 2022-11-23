public class Zemin {
    private String aciklama;
    private double genislik;
    private double uzunluk;

    public Zemin(String aciklama, double genislik, double uzunluk) throws LengthException {
        this.aciklama = aciklama;
        setGenislik(genislik);
        setUzunluk(uzunluk);
    }

    public Zemin() {
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

    public void setGenislik(double genislik) throws LengthException {
        if (genislik <= 0) throw new LengthException("Genislik pozitif olmali!");
        this.genislik = genislik;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) throws LengthException {
        if (genislik <= 0) throw new LengthException("Uzunluk pozitif olmali!");
        this.uzunluk = uzunluk;
    }

    public double alanHesapla() {
        return genislik * uzunluk;
    }

    @Override
    public String toString() {
        return String.format("%s (%5.2f x %5.2f)", aciklama, genislik, uzunluk);
    }
}
