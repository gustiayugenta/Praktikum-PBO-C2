// File         : MBangunDatar.java
// Deskripsi    : Program utama untuk menguji kelas BangunDatar, Persegi, dan Lingkaran
// Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
// Tanggal      : 17 Maret 2025
//

public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi p1 = new Persegi(5, "Biru", "Hitam");
        System.out.println("=== Info Persegi ===");
        p1.printInfo();

        // Membuat objek Lingkaran
        Lingkaran l1 = new Lingkaran(10, "Merah", "Putih");
        System.out.println("\n=== Info Lingkaran ===");
        l1.printInfo();
    }
}
