public class Sampan {
    protected int layar;

    public Sampan(int jumlahkursi, int biaya, int layar){
        super(jumlahkursi, biaya, layar);
        this.layar;
    }

    @override
    public void informasi(){
        if (layar==true){
            System.out.println("sampan dengan kursi berjumlah "+jumlahkursi+" ditetapkan dengan biaya sebesar Rp. "+biaya+);
        }
        else{
            System.out.println("sampan dengan kursi berjumlah"+jumlahkursi+"ditetapkan dengan biaya sebesar Rp. "+biaya+);

        }
    }

    public void berlayar(String ber){

    }
}
