public class MainApp 
{
    public static void main(String[] args) throws Exception 
    {
        // Memanggil informasi tentang Perangkat
        Perangkat perangkat = new Perangkat("Seagate", 4, 2.4);
        perangkat.hardwareInformation();
        System.out.println("");

        // Memanggil informasi tentang Laptop
        Laptop laptop = new Laptop("Corsair", 16, 4.20, false);
        laptop.hardwareInformation();
        laptop.openGame("Valorant");
        laptop.sendEmail("niceyuk@gmail.com");
        laptop.sendEmail("aanarji@gmail.com", "rusmangc@gmail.com");
        System.out.println("");

        // Memanggil informasi tentang Handphone
        Handphone handphone = new Handphone("Snapdragon", 6, 2.20, true);
        handphone.hardwareInformation();
        handphone.call(62812212);
        handphone.sendMessage(628639192);
        handphone.sendMesasge(622173903, 625173910);
    }
}
