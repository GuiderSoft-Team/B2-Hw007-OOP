public class MainApp {
    public static void main(String[] args) {
        //Please read readme.md file


        Hali hali = new Hali(3.5);
        Zemin zemin = new Zemin("",2.75, 4.0);
        Hesap hesap = new Hesap(zemin, hali);
        System.out.println("Toplam maliyet: " + hesap.getToplamMaliyet());
        System.out.println(hesap);







    }
}
