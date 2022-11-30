public class MainApp {
    public static void main(String[] args) {

        Hali hali = new Hali(3.5);
        Zemin zemin = new Zemin("zemin1",2.75, 4.0);
        Hesap hesap = new Hesap(zemin, hali);
        System.out.print("Toplam maliyet: " + hesap.getToplamMaliyet()+" ");

        hali = new Hali(1.5);
        zemin = new Zemin("zemin2",5.4, 4.5);
        hesap = new Hesap(zemin, hali);
        System.out.println("Toplam maliyet: " + hesap.getToplamMaliyet());

    }
}
