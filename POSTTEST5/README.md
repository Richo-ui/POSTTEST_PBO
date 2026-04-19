## LAPORAN POSTTEST 5 PRAKTIKUM PEMOGRAMAN BERBASIS OBJEK (PBO)
#### Nama: Richo Anan Rizky Putra <br> NIM: 2409106062 <br> Kelas: B1 2024

### Deskripsi Posttest
Pada posttest kali ini, saya melanjutkan posttest sebelumnya dengan menerapkan Abstraction dan Interface

Perubahan utama yang dilakukan adalah mengubah class Jamaah yang sebelumnya merupakan class biasa menjadi abstract class, 
serta menambahkan abstract method yang diimplementasikan subclass. Selain itu, saya juga menambahkan sebuah 
interface yang berisi method terkait aktivitas jamaah di masjid, dan mengimplementasikannya pada subclass yang ada

### Abstraction
Abstraction merupakan sebuah proses yang digunakan untuk menyembunyikan detail implementasi atau proses kompleks suatu objek, 
dan hanya menampilkan fungsi esensial dan fungsional. Abstraction berfokus kepada apa yang dilakukan sebuah objek dibandingkan 
bagaimana objek itu melakukannya

- #### Abstract Class
    ![img.png](Assets/img.png) <br>
saya mengubah class Jamaah yang sebelumnya class biasa menjadi abstract class yang dimana tidak bisa digunakan untuk membuat
objek, untuk memanggil abstract class diperlukan child class yang mengimplementasikan method abstract yang dibuat di abstract
class

- #### Abstract Method
    ![img_1.png](Assets/img_1.png) <br>
Implementasinya di child class seperti ini:
![img_3.png](Assets/img_3.png)
- #### Interface
    ![img_2.png](Assets/img_2.png) <br>

Interface adalah sebuah cara untuk menerapkan abstraction dengan membuat method tanpa menyertakan body methodnya

Untuk menggunakan interfacenya perlu menggunakan kata kunci "implement" di class, dan sama seperti abstract class, semua
method yang digunakan pada class harus di definisikan
![img_4.png](Assets/img_4.png)
![img_6.png](Assets/img_6.png)

![img_5.png](Assets/img_5.png)
![img_7.png](Assets/img_7.png)

Untuk penggunaan abstraction di Main tidak ada yang perlu **ditambahkan** maupun **diubah**

## Sekian dan Terima Kasih