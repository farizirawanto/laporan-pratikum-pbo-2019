# Laporan Praktikum #9 - Abstract Class dan Interface 

## Kompetensi
Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu: 
1. Menjelaskan maksud dan tujuan penggunaan Abstract Class;
2. Menjelaskan maksud dan tujuan penggunaan Interface; 
3. Menerapkan Abstract Class dan Interface di dalam pembuatan program. 



## Ringkasan Mater
Abstract Class Abstract Class adalah class yang tidak dapat diinstansiasi namun dapat di-extend. Abstract class baru dapat dimanfaatkan ketika ia di-extend.

    Kegunaan Abstract : Menggambarkan sesuatu yang bersifat umum, yang hanya bisa berfungsi setelah ia dideskripsikan ke dalam bentuk yang lebih spesifik.

    Interface Interface adalah struktur data yang hanya berisi abstract methods. Tidak ada apa-apa selain method abstract pada interface, termasuk atribut getter dan setter.

    Kegunaan Interface : Bertindak seperti semacam kontrak/syarat yang HARUS dipenuhi bagi suatu class agar class tersebut dapat dianggap sebagai ‘sesuatu yang lain’. 

## Praktikum

### Percobaan 1

Class Hewan
![](img/hewan.JPG)

Link kode program : 
[Hewan](../../Src/9_Abstract_Class_dan_Interface/Hewan.java)

Class Kucing
![](img/Kucing.JPG)

Link kode program : 
[Kucing](../../Src/9_Abstract_Class_dan_Interface/Kucing.java)

Class Ikan
![](img/Ikan.JPG)

Link kode program : 
[Ikan](../../Src/9_Abstract_Class_dan_Interface/Ikan.java)

Class Orang
![](img/Orang.JPG)

Link kode program : 
[Orang](../../Src/9_Abstract_Class_dan_Interface/Orang.java)

Class Pt1Program
![](img/main.JPG)

Link kode program : 
[Program](../../Src/9_Abstract_Class_dan_Interface/Program1.java)


### Percobaan 2
Class ICumlaude
![](img/ICumlaude.JPG)

Link kode program : 
[ICumlaude](../../Src/9_Abstract_Class_dan_Interface/ICumlaude.java)

Class Mahasiswa
![](img/Mahasiswa.JPG)

Link kode program : 
[Mhasiswa](../../Src/9_Abstract_Class_dan_Interface/Mahasiswa.java)

Class Sarjana
![](img/Sarjana.JPG)

Link kode program : 
[Sarjana](../../Src/9_Abstract_Class_dan_Interface/Sarjana.java)

Class PascaSarjana
![](img/Pascasarjana.JPG)

Link kode program : 
[PascaSarjana](../../Src/9_Abstract_Class_dan_Interface/PascaSarjana.java)

Class Rektor
![](img/Rektor.JPG)

Link kode program : 
[Rektor](../../Src/9_Abstract_Class_dan_Interface/Rektor.java)

Class Program
![](img/main2.JPG)

Link kode program : 
[Pt2Program](../../Src/9_Abstract_Class_dan_Interface/Program.java)

#### soal
a. Mengapa pada langkah nomor 9 terjadi error? Jelaskan! Jawab : Karena pada class Mahasiswa tidak ter implementasi interfaces dari Icumlaude sehingga eror ketika akan dipanggil oleh ‘Rektor’

b. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian? Jawab : Bisa, karena sarjanaCumlaude dari class Sarjana adalah kelas turunan dari ‘Mahasiswa', sehingga method ‘KulihadiKampus’ bisa dipanggil ke class Sarjana

c. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian? Jawab : Tidak bisa, karena class rektor hanya menggunakan implementasi dari Icumlaude, dan ‘kuliahDiKampus’ dari Mahasiswa tidak pernah di inisiasi di kelas rektor


### Percobaan 3

Class IBerprestasi
![](img/IBerprestasi.JPG)

Link kode program : 
[IBerprestasi](../../Src/9_Abstract_Class_dan_Interface/IBerprestasi.java)

Class PascaSarjana
![](img/Pascasarjana.JPG)

Link kode program : 
[Kucing](../../Src/9_Abstract_Class_dan_Interface/PascaSarjana.java)

Class Rektor 
![](img/Rektor.JPG)

Link kode program : 
[Ikan](../../Src/9_Abstract_Class_dan_Interface/Rektor.java)

Class Pt3Program
![](img/main2.PNG)

Link kode program : 
[Pt3Program](../../Src/9_Abstract_Class_dan_Interface/Program.java)

#### Soal
Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude. 

![](img/soalpt3.PNG)


## Kesimpulan

saya mulai mehami abstrak dan implementasi 


## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(MOCHAMAD FARIZ)***
