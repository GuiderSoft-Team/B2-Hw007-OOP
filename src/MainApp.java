public class MainApp {
    public static void main(String[] args) {
        Zemin zemin= new Zemin("",4.0, 2.75);
        Hali hali=new  Hali(3.5);


        Hesap hesap= new Hesap(zemin,hali);

        System.out.println("Toplam maliyet: " + hesap.getToplamMaliyet());


    }
}
