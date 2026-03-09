public class Jamaah {
    private String nama;
    private int umur;
    private String jenisKelamin;

    public Jamaah(String nama, int umur, String jenisKelamin) {
        this.nama=nama;
        this.umur=umur;
        this.jenisKelamin=jenisKelamin;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void Lihat() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
    }
}