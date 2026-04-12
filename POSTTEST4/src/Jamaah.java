public class Jamaah {
    protected String nama;
    protected int umur;
    protected String jenisKelamin;

    public Jamaah(String nama, int umur, String jenisKelamin) {
        this.nama=nama;
        this.umur=umur;
        this.jenisKelamin=jenisKelamin;
    }
//
//    public String getnama() {
//        return nama;
//    }
//
//    public int getUmur() {
//        return umur;
//    }
//
//    public String getJK() {
//        return jenisKelamin;
//    }


    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setJK(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
    }
    // Ini Overloading
    public void tampilkanData(boolean lengkap) {
        if (lengkap) {
            System.out.println("=== DATA LENGKAP ===");
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur);
            System.out.println("Jenis Kelamin: " + jenisKelamin);
        } else {
            System.out.println(nama + " (" + umur + "tahun)");
        }
    }
}
