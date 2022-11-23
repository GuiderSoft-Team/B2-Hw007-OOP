public class MainApp {
    public static void main(String[] args) {
        //Please read readme.md file
        Hali hali = null, hali1 = null;
        Zemin zemin = null, zemin1 = null;
        Hesap hesap = null, hesap1 = null;
        try {
            hali = new Hali(3.5);
            zemin = new Zemin("Mutfak", 2.75, 4.0);
            hesap = new Hesap(zemin, hali);

        } catch (LengthException e) {
            System.err.println(e.getMessage());
        }

        try {
            hali1 = new Hali(1.5);
            zemin1 = new Zemin("Salon", 5.4, 4.5);
            hesap1 = new Hesap(zemin1, hali1);
        } catch (LengthException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(hesap);
        System.out.println(hesap1);
    }
}
