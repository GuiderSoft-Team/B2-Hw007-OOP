public class MainApp {
    public static void main(String[] args) {

        Hali hali = new Hali(3.5);
        Zemin zemin = new Zemin("Zemin Ölçüleri :", 2.75, 4.0);
        Hesap hesap = new Hesap(zemin, hali);
        //System.out.println("Maliyet: " + hesap.getToplamMaliyet());//Maliyet: 38.5
        System.out.println(hesap);//Toplam maliyet: 38.50
        
        hali = new Hali(1.5);
        zemin = new Zemin("Zemin Ölçüleri :", 5.4, 4.5);
        hesap = new Hesap(zemin, hali);
        //System.out.println("Maliyet: " + hesap.getToplamMaliyet());//Maliyet: 36.45
        System.out.println(hesap);//Toplam maliyet: 36.45


    }
}
