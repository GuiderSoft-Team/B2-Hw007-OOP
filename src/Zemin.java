public class Zemin {
    private String aciklama;
    private double genislik;
    private double uzunluk;

    public Zemin() {
    }

    public Zemin( double genislik, double uzunluk,String aciklama) {
        this.aciklama=aciklama;

        if(genislik<0){
           this.genislik=0;
        }else{
            this.genislik = genislik;
        }
        if(uzunluk<0){
           this.uzunluk=0;
        }else{
            this.uzunluk = uzunluk;
        }

    }




    public double alanHesapla(){
        return genislik*uzunluk;
    }

    @Override
    public String toString() {
        return "Zemin{" +
                "aciklama='" + aciklama + '\'' +
                ", genislik=" + genislik +
                ", uzunluk=" + uzunluk +
                '}';
    }


}
