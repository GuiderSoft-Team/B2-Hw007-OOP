public class Zemin {
    String aciklama;
    double genislik;
    double uzunluk;

    public Zemin() {
    }

    public Zemin(String aciklama, double genislik, double uzunluk) {

        this.aciklama = aciklama;
        if (genislik<0) genislik=0;
        this.genislik = genislik;
        if (uzunluk<0) uzunluk=0;
        this.uzunluk = uzunluk;
    }

    public double alanHesapla(){
        return genislik*uzunluk;
    }


    @Override
    public String toString() {
        return String.format("%s (%fx%f)",aciklama,genislik,uzunluk);
    }

}
