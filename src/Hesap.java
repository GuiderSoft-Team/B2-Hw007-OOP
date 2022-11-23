public class Hesap {



        Zemin zemin=new Zemin();
        Hali hali=new Hali();

        public Hesap() {
        }

        public Hesap(Zemin zemin, Hali hali) {
            this.zemin = zemin;
            this.hali = hali;

        }

        public double getToplamMaliyet (){
            return hali.getFiyat()* zemin.getGenislik()* zemin.getUzunluk();
        }

        @Override
        public String toString() {
            return String.format("Toplam Maliyet:"+ getToplamMaliyet());
        }
    }



