public class MainApp{

    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Adata", 2, 1.80f);
        Laptop laptop = new Laptop("Seagate", 8, 2.40f, false);
        Handphone handphone = new Handphone("Sandisk", 3, 2.20f, true);

        perangkat.informasi();
        System.out.println("");

        laptop.informasi();
        laptop.bukaGame("Valorant");
        laptop.kirimEmail("sicepat@gmail.com");
        laptop.kirimEmail("jnt_service@gmail.com", "jne_service@gmail.com");
        System.out.println("");

        handphone.informasi();
        handphone.telfon(628080801);
        handphone.kirimSMS(628080802);
        handphone.kirimSMS(628080803, 628080804);
    }

}