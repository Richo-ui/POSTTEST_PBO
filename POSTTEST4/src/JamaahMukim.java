public class JamaahMukim extends Jamaah {

    public String alamat;

    public JamaahMukim(String nama, int umur, String jenisKelamin, String alamat) {
        super(nama, umur, jenisKelamin);
        this.alamat = alamat;
    }

    // Overriding
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Alamat  : " + alamat);
    }

//    public String getAlamat() {
//        return alamat;
//    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}