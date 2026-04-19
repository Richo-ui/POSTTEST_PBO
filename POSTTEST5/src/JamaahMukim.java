public class JamaahMukim extends Jamaah implements AktivitasMasjid {

    private String alamat;

    public JamaahMukim(String nama, int umur, String jenisKelamin, String alamat) {
        super(nama, umur, jenisKelamin);
        this.alamat = alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return  alamat;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
    }

    @Override
    public void shalat() {
        System.out.println(nama + " melaksanakan shalat di Masjid");
    }

    @Override
    public void ngaji() {
        System.out.println(nama + " mengaji di Masjid");
    }
}
