public class Zemin {
    private String acıklama;
    private double uzunluk;
    private double genislik;

    public Zemin( double uzunluk, double genislik) {

        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    public String getAcıklama() {
        return acıklama;
    }

    public void setAcıklama(String acıklama) {
        this.acıklama = acıklama;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if (uzunluk>0){
            this.uzunluk=uzunluk;
        }else {
            this.uzunluk=0;
        }
        this.uzunluk = uzunluk;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        if (genislik>0){
            this.genislik=genislik;
        }else {
            this.genislik=0;
        }
        this.genislik = genislik;
    }
    public double alanHesapla(){
        return uzunluk*genislik;
    }

    @Override
    public String toString() {
        return String.format("Zemin Uzunluğu %5.2f - Zemin Genişliği %5.2f",uzunluk,genislik);

    }
}
