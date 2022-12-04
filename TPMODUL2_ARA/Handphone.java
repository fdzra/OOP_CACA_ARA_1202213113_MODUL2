public class Handphone extends Perangkat{
    
    protected boolean fingerprint;
    
    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.drive = drive;
        this.ram = ram;
        this.processor = ram;
        this.fingerprint = fingerprint;
    }

    public void informasi(){
        System.out.print("Handphone ini memiliki drive tipe " + 
        drive + " dengan RAM sebesar " + ram + " GB" + " dan processor secepat " +
        processor + " GHz.");
        if(fingerprint == true){
            System.out.println(" Selain itu handphone ini juga memiliki fitur fingerprint.");
        }
        else{
            System.out.println(" Sayangnya, handphone ini belum memiliki fitur fingerprint.");
        }
    }

    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telepon ke nomor HP " + no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke nomor HP " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke nomor HP " + no_hp1 + " dan ke nomor HP " + no_hp2);
    }

}