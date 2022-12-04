public class Laptop extends Perangkat 
{
    protected boolean webcam;

    public Laptop(String drive, int ram, Double processor, boolean webcam)
    {
        super(drive, ram, processor);
        this.webcam = webcam;        
    }
    public void hardwareInformation()
    {
        if (webcam)
        {
            System.out.println(
                "Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " 
                + ram + " GB dan processor secepat " + processor 
                + " Ghz. Selain itu Laptop ini juga memiliki webcam"
                );
        }
        else
        {
            System.out.println(
                "Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " 
                + ram + " GB dan processor secepat " + processor 
                + " Ghz. Selain itu Laptop ini TIDAK memiliki webcam"
                );
        }
            
    }
    public void openGame(String game)
    {
        System.out.println("Laptop berhasil membuka game " + game);
    }
    public void sendEmail(String email)
    {
        System.out.println("Laptop berhasil mengirim Email ke " +email);
    }
    public void sendEmail(String email1, String email2)
    {
        System.out.println("Laptop berhasil mengirim Email ke " + email1 + " dan ke " + email2);
    }
}

