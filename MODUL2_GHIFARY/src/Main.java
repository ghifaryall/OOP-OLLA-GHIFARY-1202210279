public class Main {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasiAir = new TransportasiAir(50, 50000, 2);
        transportasiAir.informasi();

        System.out.println("");
        Sampan sampan = new Sampan(20, 5000, 2);
        sampan.informasi();
        sampan.berlayar();
        sampan.jangkar();
        sampan.nojangkar();
    }
}
