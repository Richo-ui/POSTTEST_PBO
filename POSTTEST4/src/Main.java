import java.util.*;

static ArrayList<Jamaah> daftarJamaah = new ArrayList<>();
static Scanner input = new Scanner(System.in);

public static void main(String[] args) {

    int pilihan;

    do {
        System.out.println("Sistem Manajemen Masjid Al-Fatihah");
        System.out.println("1. Tambah Jamaah");
        System.out.println("2. Lihat data Jamaah");
        System.out.println("3. Update Jamaah");
        System.out.println("4. Hapus Jamaah");
        System.out.println("5. Keluar");
        System.out.print("Pilih: ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1 -> tambah();

            case 2 -> lihat();

            case 3 -> update();

            case 4 -> hapus();

            case 5 -> System.out.println("Program Selesai!");

            default -> {
                System.out.println("Maaf pilihan Anda salah, mohon coba lagi");
                System.out.println();
            }
        }
    } while (pilihan != 5);
}

static void tambah() {
    String nama;
    int umur;
    String jk;

    input.nextLine();

    System.out.print("Masukkan Nama: ");
    nama = input.nextLine();

    System.out.print("Masukkan Umur: ");
    umur = input.nextInt();
    input.nextLine();

    while (true) {
        System.out.print("Masukkan Jenis Kelamin (Laki-Laki/Perempuan): ");
        jk = input.nextLine().toLowerCase();

        if (jk.equals("laki-laki") || jk.equals("perempuan")) {
            break;
        } else {
            System.out.println("Input salah! Hanya Laki-Laki atau Perempuan");
        }
    }

    System.out.println("Masukkan status Jamaah: ");
    System.out.println("1. Jamaah Mukim");
    System.out.println("2. Jamaah Musafir");
    System.out.print("Pilihan: ");
    int pilihStatus = input.nextInt();
    input.nextLine();

    Jamaah jamaah;

    if (pilihStatus == 1) {
        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        jamaah = new JamaahMukim(nama, umur, jk, alamat);

    } else if (pilihStatus == 2) {
        System.out.print("Masukkan Asal Daerah: ");
        String asalDaerah = input.nextLine();

        jamaah = new JamaahMusafir(nama, umur, jk, asalDaerah);

    } else {
        System.out.println("Pilihan tidak valid!");
        return;
    }

    daftarJamaah.add(jamaah);

    System.out.println("Data berhasil ditambahkan!");
    System.out.print("Tekan Enter untuk lanjut");
    input.nextLine();
    System.out.println();

}


static void lihat() {
    if (daftarJamaah.isEmpty()) {
        System.out.println("Data masih kosong!");
        System.out.print("Tekan Enter untuk lanjut");
        input.nextLine();
        input.nextLine();
        System.out.println();
    } else {

        int i = 1;

        for (Jamaah jamaah : daftarJamaah) {

            System.out.println("Data ke-" + i);
            jamaah.tampilkanData(); //implemen overriding
            System.out.println("Versi Singkat:");
            jamaah.tampilkanData(false);
            System.out.print("Tekan Enter untuk lanjut");
            input.nextLine();
            input.nextLine();
            System.out.println();

            i++;
        }
    }
}

static void update() {
    String nama;
    int umur;
    String jk;

    lihat();

    System.out.print("Masukkan nomor yang ingin diubah: ");
    int index = input.nextInt() - 1;
    input.nextLine();

    System.out.print("Masukkan Nama yang Baru: ");
    nama = input.nextLine();

    System.out.print("Masukkan Umur yang Baru: ");
    umur = input.nextInt();
    input.nextLine();

    while (true) {
        System.out.print("Masukkan Jenis Kelamin yang Baru: ");
        jk = input.nextLine().toLowerCase();

        if (jk.equals("laki-laki") || jk.equals("perempuan")) {
            break;
        } else {
            System.out.println("Input salah! Hanya Laki-Laki atau Perempuan");
        }
    }

    Jamaah jamaah = daftarJamaah.get(index);
    jamaah.setNama(nama);
    jamaah.setUmur(umur);
    jamaah.setJK(jk);

    if (jamaah instanceof JamaahMukim) {
        JamaahMukim jm = (JamaahMukim) jamaah;

        System.out.println("Masukkan Alamat Baru: ");
        String alamat = input.nextLine();

        jm.setAlamat(alamat);

    } else if (jamaah instanceof JamaahMusafir) {
        JamaahMusafir js = (JamaahMusafir) jamaah;

        System.out.println("Masukkan Asal Daerah Baru: ");
        String asalDaerah = input.nextLine();

        js.setAsalDaerah(asalDaerah);
    }

    System.out.println("Data berhasil diubah!");
    System.out.print("Tekan Enter untuk lanjut");
    input.nextLine();
    System.out.println();
}

static void hapus() {

    lihat();

    System.out.print("Masukkan nomor data yang ingin dihapus: ");
    int index = input.nextInt() - 1;

    daftarJamaah.remove(index);

    System.out.println("Data berhasil dihapus!");
    System.out.print("Tekan Enter untuk lanjut");
    input.nextLine();
    input.nextLine();
    System.out.println();
}