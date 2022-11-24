public class MainApp {
    public static void main(String[] args) {
        String aciklama="merinos";
        Zemin zemin= new Zemin(2.75,4.0, aciklama);
        Hali hali=new Hali(3.5);


        Hesap hesap= new Hesap(zemin,hali);

        System.out.println("Toplam maliyet: " + hesap.getToplamMaliyet());



    }
}
