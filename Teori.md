# Teori-PBO

<h3>A.Wrapper Class</h3>
<p class="text_content">   Wrapper Class (Kelas Pembungkus) adalah suatu mekanisme yang digunakan untuk mengconvert atau mengubah suatu nilai yang di definisikan, dari tipe data primitif seperti Boolean, Character, Integer, Long, Float, dsb. menjadi sebuah nilai dengan tipe data referensi (Objek).</p>
    
<p>Table yang menjelaskan macam-macam tipe data primitif dan referensi pada Java:</p>

<img  src= "https://user-images.githubusercontent.com/65879490/83326240-7c2ad080-a29c-11ea-8489-198313c903c5.png"/>


<p align="center">Contoh Program : <i>WrapperClass.java</p>

<h3>B.Final,Finally,Finalize</h3>
<p>Kata Kunci <u>final</u> adalah keyword untuk mendeklarasikan bahwa sebuah variabel/atribut tidak dapat diubah lagi isinya, artinya kata kunci ini mengartikan bahwa variabel tersebut sudah final. Kita juga dapat membuat konstanta dengan cara menyertakan kata kunci final di dalam variabel.</p>
<p>Apabila kata kunci <u>final</u> disertakan ke dalam pembuatan method, artinya method tersebut tidak dapat di override oleh subclassnya (kelas turunannya).</p>
<p>Sedangkan jika kata kunci #final disebutkan di dalam pembuatan sebuah class, artinya class tersebut tidak dapat diturunkan lagi (sudah final).</p>
<p align="center">Contoh Program : <i>Final.java</i> </p>

<p>Kata kunci #finally merupakan tag dalam try-catch-finally yang berfungsi untuk memastikan bahwa kode di dalam blok finally akan dieksekusi meskipun kondisi dalam blok try sukses / gagal dieksekusi.</p>
<p align="center">Contoh Program : <i>Finally.java</i></p>


<p>Sedangkan kata kunci#finalize merupakan method kelas Object yang akan dieksekusi saat garbace collection menghapus sebuah object yang sudah tidak digunakan/terpakai pada memori.</p>
<p align="center">Contoh Program : <i>Finalize.java</i> </p>
