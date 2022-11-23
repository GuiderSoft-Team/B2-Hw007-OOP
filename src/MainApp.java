public class MainApp {
    public static void main(String[] args) {
        //Please read readme.md file

        Hali hali=new Hali(3.5);
        Zemin zemin=new Zemin("Hali",2.75,4.0);
        Hesap hesap=new Hesap(zemin,hali);
        System.out.println(hesap);
        System.out.println("Toplam Maliyet = "+hesap.getToplamMaliyet());
        System.out.println();
        hali=new Hali(1.5);
        zemin=new Zemin("Kilim",5.4,4.5);
        hesap=new Hesap(zemin,hali);
        System.out.println(hesap);
        System.out.println("Toplam Maliyet = "+hesap.getToplamMaliyet());


    }
}
