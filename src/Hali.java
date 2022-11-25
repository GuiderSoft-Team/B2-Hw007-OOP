public class Hali {

    private double fiyat;
    public Hali(){
    }

    public Hali(double fiyat){
        if (fiyat>0){
            this.fiyat=fiyat;
        }else {
            this.fiyat=0;
        }

    }
     public  double getFiyat(){
        return fiyat;
     }

    @Override
    public String toString() {
        return "Hali{" +
                "birimFiyatı:" + fiyat +
                '}';
    }
}
