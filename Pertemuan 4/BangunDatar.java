/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar
 * Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
 * Tanggal      : 17 Maret 2025
 */

public class BangunDatar {
    public int jmlSisi;
    public String warna;
    public String border;
    public static int counterBangunDatar = 0;

    public BangunDatar () {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi () {
        return jmlSisi;
    }

    public void setJmlSisi (int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna () {
        return warna;
    }

    public void setWarna (String warna) {
        this.warna = warna;
    }

    public String getBorder () {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo () {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}

// Lakukan eksperimen penggunaan keyword final seperti berikut:
// 1. Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas Persegi dan Lingkaran?
// 2. Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada method printInfo() di dalam kelas BangunDatar. 
//    Bagaimana pengaruhnya dengan method printInfo() pada kelas Persegi dan Lingkaran?

// Jawaban

// 1. Jika kita menambahkan final pada kelas BangunDatar, seperti berikut:
//    public final class BangunDatar {
//           ...
//    }

//    Hasilnya:
//    Kelas BangunDatar tidak bisa diwarisi oleh kelas lain.
//    Karena Persegi dan Lingkaran mewarisi BangunDatar, maka akan terjadi error kompilasi:
//       error: cannot inherit from final BangunDatar
//       class Persegi extends BangunDatar {
//                         ^
//       error: cannot inherit from final BangunDatar
//       class Lingkaran extends BangunDatar {

//    Jadi, menambahkan final pada kelas membuat kelas tersebut tidak bisa diwarisi oleh kelas lain.


// 2. Jika kita menghapus final dari kelas BangunDatar dan menambahkan final pada method printInfo(), seperti berikut:
//    public class BangunDatar {
//          ...
//    public final void printInfo() {
//         System.out.println("Jumlah sisi: " + jmlSisi);
//         System.out.println("Warna: " + warna);
//         System.out.println("Border: " + border);
//         }
//    }

//    Hasilnya:
//    Method printInfo() tidak bisa dioverride di kelas Persegi dan Lingkaran.
//    Karena kedua kelas tersebut mencoba untuk override method printInfo(), akan terjadi error kompilasi seperti ini:
//        error: printInfo() in Persegi cannot override printInfo() in BangunDatar
//              public void printInfo() {
//                 ^
//         overridden method is final

//        error: printInfo() in Lingkaran cannot override printInfo() in BangunDatar
//              public void printInfo() {
//                 ^
//         overridden method is final

//    Jadi, menambahkan final pada method mencegah method tersebut dioverride oleh subclass.

