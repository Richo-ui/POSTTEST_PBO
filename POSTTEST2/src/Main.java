import java.util.*;

static ArrayList<Jamaah> daftarJamaah = new ArrayList<>();
static Scanner input = new Scanner(System.in);

void main() {

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

    Jamaah jamaah = new Jamaah(nama, umur, jk);

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
//          Penggunaan Getter
            System.out.println("Nama :  " + jamaah.getnama());
            System.out.println("Umur :  " + jamaah.getUmur());
            System.out.println("Jenis Kelamin : " + jamaah.getJK());
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

//    Penggunaan Setter
    daftarJamaah.get(index).setNama(nama);
    daftarJamaah.get(index).setUmur(umur);
    daftarJamaah.get(index).setJK(jk);

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