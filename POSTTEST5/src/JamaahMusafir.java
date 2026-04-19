public class JamaahMusafir extends Jamaah implements AktivitasMasjid {

    private String asalDaerah;

    public JamaahMusafir(String nama, int umur, String jenisKelamin, String asalDaerah) {
        super(nama, umur, jenisKelamin);
        this.asalDaerah = asalDaerah;
    }

    public void setAsalDaerah(String asalDaerah) {
        this.asalDaerah = asalDaerah;
    }

    public String getAsalDaerah() {
        return asalDaerah;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Asal Daerah: " + asalDaerah);
    }

    @Override
    public void shalat() {
        System.out.println(nama + " melaksanakan shalat saat singgah di Masjid");
    }

    @Override
    public void ngaji() {
        System.out.println(nama + " mengaji saat singgah di Masjid");
    }
}
