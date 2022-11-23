public class Zemin {
    private String aciklama;
    private double genislik;
    private double uzunluk;

    public Zemin() {
    }

    public Zemin (String aciklama, double genislik, double uzunluk) {
        /*this.aciklama = aciklama;
        this.genislik = genislik;
        this.uzunluk = uzunluk;*/
        setAciklama(aciklama);
        setGenislik(genislik);
        setUzunluk(uzunluk);
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        if (aciklama.isEmpty()){
            this.aciklama="";
        } else {
        this.aciklama = aciklama;}
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        if (genislik<0){
            this.genislik=0;
        } else {
        this.genislik = genislik;}
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if (uzunluk<0){
            this.uzunluk=0;
        } else {
        this.uzunluk = uzunluk;}
    }

    @Override
    public String toString( ) {
        return String.format("%s (%fX%f)",aciklama,genislik,uzunluk);
    }
}
