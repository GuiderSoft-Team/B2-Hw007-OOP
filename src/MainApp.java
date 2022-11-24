public class MainApp {
    public static void main(String[] args) {
        //Please read readme.md file

        Zemin zemin=new Zemin();
        Hali hali=new Hali();
        Hesap hesap=new Hesap();
        System.out.println(hesap);
        hali=new Hali(1.5);
        zemin=new Zemin(5.4,4.5);
        hesap=new Hesap(zemin,hali);
        System.out.println("Toplam Maliye:"+hesap.getToplamMaliyet());

    }
}
//Hocam herseyi uygulamaya calismama ragmen bir turlu sorunu bulamadim.Toplam maliyet "0"cikiyor.