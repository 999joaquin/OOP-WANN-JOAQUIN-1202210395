public class Handphone extends Perangkat
{
    protected boolean fingerprint;

    public Handphone(String drive, int ram, Double processor, boolean fingerprint)
    {
        super(drive, ram, processor);
        this.fingerprint = fingerprint; 
    }

    public void hardwareInformation()
    {
        if (fingerprint)
        {
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu handphone ini juga memiliki fingerprint");
        }
        else 
        {
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu handphone ini TIDAK memiliki fingerprint");
        }
    }
    public void call(int nomor)
    {
        System.out.println("Handphone berhasil menyambungkan telfon ke No " + nomor);
    }
    public void sendMessage(int nomor)
    {
        System.out.println("Handphone berhasil mengirim SMS ke No " + nomor);
    }
    public void sendMesasge(int nomor1, int nomor2)
    {
        System.out.println("Handphone berhasil mengirim SMS ke No " + nomor1 + " dan ke No " + nomor2);
    }
}

