/**
 * MainApp
 */
public class MainApp {

    public static void main(String[] args) throws Exception {
        Sampan sampan1 = new Sampan(40, 50000, 2);
        sampan1.informasi();
        sampan1.berlayar();
        sampan1.berlabuh();
        sampan1.berlabuh(2);
        System.out.println("");

        Kapal kapal1 = new Kapal(80, 150000, "Diesel");
        kapal1.informasi();
        kapal1.berlayar();
        kapal1.berlayar(65);
        kapal1.berlabuh();
    }
}