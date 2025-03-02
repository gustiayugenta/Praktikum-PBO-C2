/* Nama File    : MDosen.java
 * Deskripsi    : Main class Dosen
 * Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
 * Tanggal      : Minggu, 2 Maret 2025
 */

public class MDosen {
    public static void main(String[] args) {
        // Tanpa parameter
        Dosen D1 = new Dosen();
        D1.setNip("210523");
        D1.setNama("Sumiarti");
        D1.setProdi("Informatika");

        System.out.println("===== Dosen 1 =====");
        System.out.println("NIP  : " + D1.getNip());
        System.out.println("Nama : " + D1.getNama());
        System.out.println("Prodi: " + D1.getProdi());

        // Menggunakan parameter
        Dosen D2 = new Dosen("141220", "Kuscahyo", "Teknik Industri");

        System.out.println("\n===== Dosen 2 =====");
        System.out.println("NIP  : " + D2.getNip());
        System.out.println("Nama : " + D2.getNama());
        System.out.println("Prodi: " + D2.getProdi());
    }
}