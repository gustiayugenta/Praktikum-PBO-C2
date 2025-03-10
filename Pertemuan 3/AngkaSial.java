/**
 * File         : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
 * Nama         : Gusti Ayu Genta Bhuana Paramitha
 * NIM          : 24060123130110
 */

public class AngkaSial{

    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + "bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}


// Pertanyaan
// 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
// 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
// Jelaskan pada lembar praktikum anda ! 

// Jawaban
// 1. Tidak, baris 12 pada kode as.cobaAngka(13); tidak selesai  dieksekusi sepenuhnya karena saat nilai 13 dimasukkan, 
//    exception  AngkaSialException  langsung  dilempar (throw new AngkaSialException();).  Karena  terjadi  exception, 
//    eksekusi  program  langsung  dialihkan ke blok catch,  sehingga baris berikutnya dalam try tidak akan dijalankan.

// 2. Ya, baris 21 yang mencetak  pesan eksepsi  dan  peringatan  dalam  blok  catch  tetap  akan  dieksekusi. Setelah 
//    exception dilempar dari cobaAngka(13), eksekusi lompat ke catch(AngkaSialException ase). Method ase.getMessage() 
//    akan mencetak pesan  dari  exception  ("jangan memasukkan angka 13 karena angka sial !!!") dan kemudian mencetak 
//    "hati-hati memasukkan angka!!!".