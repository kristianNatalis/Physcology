# 🧠 Mind Journal: PsyLog Application

[![Language](https://img.shields.io/badge/language-Java-orange.svg)](https://www.oracle.com/java/)
[![OOP Paradigm](https://img.shields.io/badge/paradigm-Object--Oriented-blue.svg)](https://en.wikipedia.org/wiki/Object-oriented_programming)
[![Platform](https://img.shields.io/badge/platform-Console%20%7C%20Terminal-lightgrey.svg)](https://github.com/)

## Tentang Program

**Mind Journal** (atau **PsyLogApp**) adalah sebuah aplikasi berbasis konsol (*command-line interface*) yang dirancang khusus sebagai platform manajemen kesehatan mental digital terintegrasi. Program ini berfungsi untuk menjembatani komunikasi data antara klien (pasien) dengan psikolog secara terstruktur. Fokus utama dari sistem ini adalah mempermudah pelacakan kondisi emosional harian (*mood tracking*) dan durasi tidur pasien, sekaligus memberikan kendali kepada psikolog untuk memantau perkembangan serta memberikan intervensi klinis yang disesuaikan dengan kebutuhan setiap individu.

Aplikasi ini dibangun menggunakan bahasa pemrograman **Java** dengan menerapkan prinsip dasar **Object-Oriented Programming (OOP)** secara ketat demi menjamin fleksibilitas dan kemudahan pengembangan kode di masa mendatang. Struktur program ini memisahkan peran pengguna ke dalam dua entitas berbeda yang mewarisi sifat dasar yang sama, sehingga manajemen hak akses fungsi di dalam sistem dapat berjalan secara aman, teratur, dan efisien.

---

## Penerapan Konsep OOP dalam Kode

Desain arsitektur perangkat lunak pada proyek ini memanfaatkan pilar utama pemrograman berorientasi objek untuk menciptakan sistem yang modular. Fondasi utama aplikasi ini terletak pada kelas abstrak bernama `User`. Kelas abstrak ini berfungsi sebagai cetakan dasar (*blueprint*) yang memuat atribut bersama seperti nama pengguna, sekaligus mendefinisikan metode abstrak `tampilkanMenu()`. Melalui mekanisme ini, konsep **Polimorfisme** dapat diimplementasikan dengan optimal, di mana setiap sub-kelas memiliki kemampuan untuk merealisasikan tampilan antarmuka menu yang sepenuhnya berbeda sesuai dengan hak akses masing-masing.

Struktur inheritance ini kemudian diturunkan secara spesifik ke dalam dua kelas utama, yaitu `Pasien` dan `Psikolog`. Kelas `Pasien` bertanggung jawab untuk mengelola data personal yang dinamis, termasuk di dalamnya adalah enkapsulasi riwayat jurnal harian menggunakan struktur data `ArrayList<String>` serta pelacakan target jam tidur. Di sisi lain, kelas `Psikolog` bertindak sebagai entitas administrator yang dilengkapi dengan sistem keamanan berbasis kata sandi konstan untuk memvalidasi akses sebelum psikolog dapat melakukan pengawasan menyeluruh terhadap seluruh data klien yang terdaftar di dalam sistem.

---

## Alur Kerja dan Fitur Utama Sistem

Ketika aplikasi dijalankan melalui kelas utama `PsyLogApp`, pengguna akan dihadapkan pada halaman gerbang masuk utama yang memisahkan alur kerja sistem menjadi dua dasbor interaktif:

### 1. Sisi Klien (Pasien Dashboard)
Klien dapat masuk ke dalam sistem menggunakan nama mereka. Jika nama yang dimasukkan belum terdaftar dalam basis data dinamis, sistem secara otomatis menawarkan opsi enkapsulasi untuk membuat akun baru secara instan. Setelah berhasil masuk, klien dapat mengakses fitur pelacakan kesehatan mental, di mana mereka dapat mengisi jurnal harian yang merekam tanggal, kondisi *mood*, aktivitas yang dilakukan, serta durasi tidur dalam satuan jam. Selain itu, pasien dapat melihat kembali seluruh linimasa riwayat jurnal yang telah mereka tulis untuk melakukan refleksi mandiri terhadap kondisi emosional mereka.

### 2. Sisi Administrator (Psychologist Dashboard)
Untuk memastikan kerahasiaan data, dasbor psikolog dilindungi oleh sistem otentikasi kata sandi. Setelah berhasil melakukan verifikasi keamanan, seorang psikolog mendapatkan kontrol penuh untuk memantau kesehatan mental seluruh klien yang terdaftar. Fitur utama di dasbor ini meliputi pemantauan seluruh riwayat jurnal klien secara *real-time*, kemampuan mengubah target durasi tidur pasien sebagai bentuk intervensi klinis atau terapi, serta hak akses administratif untuk menghapus data klien dari sistem jika masa konseling telah selesai.

---

## Panduan Kompilasi dan Eksekusi

Aplikasi ini murni berjalan di atas lingkungan terminal tanpa memerlukan dependensi eksternal yang rumit, sehingga sangat ringan dan kompatibel untuk dijalankan di berbagai sistem operasi. Untuk mencoba program ini di komputer lokal Anda, langkah pertama adalah mengunduh atau melakukan kloning repositori ini. Pastikan Java Development Kit (JDK) sudah terpasang dengan baik di sistem Anda.

Proses kompilasi dapat dilakukan melalui terminal atau command prompt dengan masuk ke direktori proyek dan mengeksekusi perintah kompilasi standar Java. Setelah seluruh berkas `.java` berhasil dikompilasi ke dalam bentuk berkas *bytecode*, Anda dapat langsung menjalankan program utama. Seluruh interaksi di dalam program menggunakan pemindai input dinamis (`Scanner`), memastikan pengalaman pengguna yang interaktif dan responsif langsung dari baris perintah terminal Anda.

---

## Lisensi dan Pengembangan
Proyek ini dikembangkan sebagai bentuk implementasi praktis dari struktur data dan arsitektur kode berbasis objek. Seluruh kode sumber terbuka untuk dipelajari, dimodifikasi, dan dikembangkan lebih lanjut guna keperluan riset akademik maupun pengembangan portofolio teknologi di bidang psikologi komputasional.
