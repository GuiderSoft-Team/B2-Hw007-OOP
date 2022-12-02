public class Zemin {
    private String aciklama;
    private double genislik;
    private double uzunluk;

    public Zemin(String aciklama, double genislik, double uzunluk) {
        if(aciklama==null|aciklama.isBlank()) aciklama="Anonim";
        this.aciklama = aciklama;

        if(genislik<0) genislik=0;
        this.genislik = genislik;

        if(uzunluk<0) uzunluk=0;
        this.uzunluk = uzunluk;
    }

    public double alanHesapla(){
        return uzunluk*genislik;
    }

    @Override
    public String toString() {
        return String.format("%s (%5.2f x %5.2f)",aciklama,genislik,uzunluk);
    }
}
