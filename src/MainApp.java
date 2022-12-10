public class MainApp {
    public static void main(String[] args) {
        //Please read readme.md file

        Hali hali1=new Hali(3.5);
        Zemin zemin1=new Zemin("Mutfak",2.75,4);
        Hesap hesap1=new Hesap(zemin1,hali1);

        System.out.println("Toplam maaliyet1 : "+hesap1.getToplamMaliyet());

        Hali hali2=new Hali(1.5);
        Zemin zemin2=new Zemin("Salon",5.4,4.5);
        Hesap hesap2=new Hesap(zemin2,hali2);
        System.out.println("Toplam maaliyet2 : "+hesap2.getToplamMaliyet());







    }
}
