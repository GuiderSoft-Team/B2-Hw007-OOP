public class Zemin {
    private String aciklama;
    private double genislik;
    private double uzunluk;

    public Zemin() {
    }

    public Zemin(String aciklama, double genislik, double uzunluk) {
        if (genislik<0.0){
            this.genislik = 0.0;
        }else {
            this.genislik=genislik;
        }
        if (uzunluk<0.0){
            this.uzunluk=0.0;
        }else {
            this.uzunluk = uzunluk;
        }
        this.aciklama = aciklama;
    }

    public double alanHesapla(){
        return genislik*uzunluk;
    }

    @Override
    public String toString() {
        return aciklama + "("+genislik+"x"+uzunluk+")";
    }
}
