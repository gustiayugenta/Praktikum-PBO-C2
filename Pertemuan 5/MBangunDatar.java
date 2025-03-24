// File         : MBangunDatar.java
// Deskripsi    : Program utama untuk menguji kelas BangunDatar, Persegi, dan Lingkaran
// Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
// Tanggal      : 17 Maret 2025
//

public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi
        // Persegi p1 = new Persegi(5, "Biru", "Hitam");
        BangunDatar P1 = new Persegi(10, "Hitam", "Putih");
        Persegi P2 = new Persegi(5, "Hitam", "Putih");
        BangunDatar L1 = new Lingkaran(28, "Merah", "Putih");
        Lingkaran L2 = new Lingkaran(28, "Biru", "Putih");
        System.out.println("=== Info Persegi 1 ===");
        P1.printInfo();
        System.out.println("\n=== Info Persegi 2 ===");
        P2.printInfo();

        // Membuat objek Lingkaran
        // Lingkaran l1 = new Lingkaran(10, "Merah", "Putih");
        System.out.println("\n=== Info Lingkaran 1 ===");
        L1.printInfo();
        System.out.println("\n=== Info Lingkaran 2 ===");
        L2.printInfo();
    }
}
