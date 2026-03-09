## LAPORAN POSTTEST 1 PEMOGRAMAN BERBASIS OBJEK (PBO)
#### Nama: Richo Anan Rizky Putra <br> NIM: 2409106062 <br> Kelas: B1 24

### Deskripsi program
Program yang saya buat adalah program CRUD sederhana dengan judul "Sistem Manajemen Masjid Al-Fatihah"<br>
Penjelasan CRUD ada dibawah

### Class Jamaah
![Class Jamaah.png](Assets/Class%20Jamaah.png)
Pada gambar diatas adalah class Jamaah yang berisi variabel _nama_, _umur_, dan _jenisKelamin_ <br>
ada constructor yang digunakan untuk mengisi nilai _nama_, _umur_, dan _jenisKelamin_ apabila ditambahkan, <br>
lalu ada _setNama_, _setUmur_, dan _setJenisKelamin_ untuk mengubah nilai pada saat di Update <br>
terakhir ada Lihat() yang dipanggil di class Main dan digunakan di opsi "Lihat Data Jamaah" <br>

### Import dan Class Main
![Class Main.png](Assets/Class%20Main.png)
Pada gambar diatas terdapat _import_ yang digunakan untuk mengimpor semua package terutama package utility java <br>
kemudian ada Arraylist, digunakan untuk menyimpan data Jamaah ke dalam array, dan Scanner, digunakan untuk membaca input

### void main
![void main(pilihan).png](Assets/void%20main%28pilihan%29.png)
![void main(case).png](Assets/void%20main%28case%29.png)
![menu awal.png](Assets/menu%20awal.png)
Gambar diatas merupakan tempat dimana program pertama kali dijalankan, didalamnya terdapat Menu dari sistem,
lalu ada perulangan _do while_ yang memungkinkan program terus berjalan sampai pengguna memilih "Keluar",
kemudian ada switch case yang digunakan untuk mengontrol alur program berdasarkan input pengguna, <br>
memilih opsi 1, akan ke menu menambahkan data Jamaah, <br>
memilih opsi 2, akan ke menu yang menampilkan data Jamaah yang telah ditambahkan, <br>
memilih opsi 3, akan ke menu yang digunakan mengubah/mengupdate data Jamaah yang sudah ada, <br>
memilih opsi 4, akan ke menu menghapus data Jamaah yang ada, <br>
memilih opsi 5, akan keluar dari Program dengan pesan "Program Selesai", <br>
memilih opsi selain 1-5 (default), seperti 6-0 akan muncul pesan yang memberitahu bahwa input salah, dan akan diminta untuk 
mengisi pilihan ulang

### Tambah data Jamaah
![tambah(1).png](Assets/tambah%281%29.png)
![tambah(2).png](Assets/tambah%282%29.png)
![opsi 1.png](Assets/opsi%201.png)
Gambar diatas merupakan sistem CRUD untuk menambahkan data jamaah ke dalam daftarJamaah <br>
Setelah memilih opsi 1 di awal sistem, pengguna akan diarahkan ke menu ini, pada awal diminta untuk memasukkan nama jamaah,
lalu umurnya, dan terakhir jenis kelamin, untuk bagian jenis kelamin pengguna hanya terbatas dapat mengisi antara laki-laki
atau perempuan, mengisi selain itu akan muncul pesan yang meminta untuk mengisi ulang bagian jenis kelamin, penggunaan 
.toLowerCase agar apabila pengguna mengisi dengan huruf kapital program masih bisa berjalan normal <br>
Setelah selesai mengisi, akan muncul pesan "Data berhasil ditambahkan" yang menandakan data telah berhasil ditambahkan

### Lihat data Jamaah
![lihat().png](Assets/lihat%28%29.png)
![opsi 2.png](Assets/opsi%202.png) <br>
Gambar diatas merupakan sistem CRUD untuk membaca/menampilkan data jamaah yang ditambahkan, apabila data
masih kosong, akan muncul pesan yang memberitahu bahwa data masih kosong

### Update data Jamaah
![update(1).png](Assets/update%281%29.png)
![update(2).png](Assets/update%282%29.png)
![opsi 3(1).png](Assets/opsi%203%281%29.png)
![opsi 3(2).png](Assets/opsi%203%282%29.png)
Gambar diatas merupakan sistem CRUD untuk memperbarui/mengubah data jamaah yang ada/yang telah ditambahkan <br>
Di awal pengguna diminta untuk memasukkan nomor data yang ingin diubah, dilanjut dengan mengisi nama, umur, dan jenis kelamin <br>
Setelah selesai akan muncul pesan yang memberitahu bahwa data berhasil diubah

### Hapus data Jamaah
![hapus().png](Assets/hapus%28%29.png)
![opsi 4(1).png](Assets/opsi%204%281%29.png)
![opsi 4(2).png](Assets/opsi%204%282%29.png)
Gambar diatas merupakan sistem CRUD untuk menghapus data jamaah yang ada <br>
Serupa dengan sistem _Update_, pengguna diminta untuk memasukkan nomor data yang ingin dihapus, diakhir akan muncul pesan
yang memberitahu bahwa data telah berhasil dihapus

![opsi 5.png](Assets/opsi%205.png) <br>
Gambar diatas merupakan tampilan saat memilih opsi 5 "Keluar"

