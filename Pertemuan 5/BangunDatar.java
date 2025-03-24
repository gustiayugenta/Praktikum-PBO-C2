/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar
 * Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
 * Tanggal      : 17 Maret 2025
 */

public abstract class BangunDatar {
    public int jmlSisi;
    public String warna;
    public String border;
    public static int counterBangunDatar = 0;

    public abstract double getLuas();
    public abstract double getKeliling();

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

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
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


// Soal

// 1. Panggilah method yang telah dibuat pada Langkah nomor 4 pada main method dari objek-objek yang
//    telah dibuat pada langkah nomor 3.

// 2. Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek
//    bangun datar yang berbeda?

// 3. Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas()
//    dan isEqualKeliling pada class BangunDatar? Mengapa?

// 4. Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?

// Jawaban

// 1. Di main method, kita perlu memanggil method yang telah dibuat pada langkah 4 untuk membandingkan 
//    objek-objek bangun datar yang dibuat pada langkah 3. Contohnya:
//    
//    public class Main {
//         public static void main(String[] args) {
//             Persegi p1 = new Persegi(5);
//             Persegi p2 = new Persegi(7);
//             Lingkaran l1 = new Lingkaran(3);

//             System.out.println("Apakah luas p1 dan p2 sama? " + p1.isEqualLuas(p2));
//             System.out.println("Apakah keliling p1 dan p2 sama? " + p1.isEqualKeliling(p2));
//             System.out.println("Apakah luas p1 dan l1 sama? " + p1.isEqualLuas(l1));
//             System.out.println("Apakah keliling p1 dan l1 sama? " + p1.isEqualKeliling(l1));
//         }
//     }

// 2. Ya, jika method isEqualLuas() dan isEqualKeliling() menggunakan parameter bertipe BangunDatar, 
//    maka mereka bisa membandingkan objek bangun datar yang berbeda. Contohnya:
//    
//    public boolean isEqualLuas(BangunDatar X){
//        return this.getLuas() == X.getLuas();
//    }

//    Jika parameter menggunakan BangunDatar, method ini dapat digunakan untuk membandingkan luas 
//    atau keliling dari berbagai jenis bangun datar seperti persegi, lingkaran, segitiga, dll.

// 3. Tidak bisa secara langsung, karena BangunDatar sebagai class induk tidak memiliki implementasi
//    konkret untuk hitungLuas() dan hitungKeliling(). Jika BangunDatar bukan abstract class, kita
//    harus menyediakan implementasi default, tetapi ini tidak masuk akal karena luas dan keliling 
//    berbeda untuk setiap bentuk.

//    Dengan menjadikannya abstract class, kita dapat membuat isEqualLuas() dan isEqualKeliling() 
//    menggunakan metode abstrak hitungLuas() dan hitungKeliling(), yang akan diimplementasikan 
//    oleh subclass.

// 4. Kelebihan:
//    - Memastikan Polimorfisme: Dengan BangunDatar sebagai abstract class, kita bisa membuat 
//      daftar atau metode yang menangani semua jenis bangun datar secara umum.

//    - Mencegah Pembuatan Objek dari Class Induk: BangunDatar seharusnya tidak memiliki objek
//      langsung, karena setiap bangun memiliki cara menghitung luas dan keliling yang berbeda.

//    - Memaksa Implementasi di Subclass: Semua subclass harus mengimplementasikan hitungLuas() dan 
//      hitungKeliling(), sehingga tidak ada perhitungan yang terlewatkan.
