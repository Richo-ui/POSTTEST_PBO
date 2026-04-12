public class JamaahMusafir extends Jamaah{

    public String asalDaerah;

    public JamaahMusafir(String nama, int umur, String jenisKelamin, String asalDaerah) {
        super(nama, umur, jenisKelamin);
        this.asalDaerah = asalDaerah;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Asal Daerah : " + asalDaerah);
    }

//    public String getAsalDaerah() {
//        return asalDaerah;
//    }

    public void setAsalDaerah(String asalDaerah) {
        this.asalDaerah = asalDaerah;
    }
}