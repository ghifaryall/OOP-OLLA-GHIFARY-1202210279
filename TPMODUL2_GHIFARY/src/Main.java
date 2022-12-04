public class Main {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("Samsung",4,2.4f);
        perangkat.informasi();

        System.out.println("");

        Laptop laptop = new Laptop("Barracuda",8,3.5f,true);
        laptop.informasi();
        laptop.bukaGame("mobil lejen");
        laptop.kirimEmail("sumbul@gmail.com");
        laptop.kirimEmail("savesta@gmail.com", "kumalala@yahoo.com");

        System.out.println("");

        Handphone handphone = new Handphone("samsung",2,2.2f, false);
        handphone.informasi();
        handphone.telfon(624678942);
        handphone.kirimSMS(627657397);
        handphone.kirimSMS(62524123, 62124352);

    }
}
