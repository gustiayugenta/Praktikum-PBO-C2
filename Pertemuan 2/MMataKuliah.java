/* Nama File    : MMataKuliah.java
 * Deskripsi    : Main class MataKuliah
 * Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
 * Tanggal      : Minggu, 2 Maret 2025
 */

public class MMataKuliah {
    public static void main(String[] args) {
        // Tanpa parameter
        MataKuliah MK1 = new MataKuliah();
        MK1.setIdMatKul("IF101");
        MK1.setNama("Pemrograman Dasar");
        MK1.setSks(3);

        System.out.println("===== Mata Kuliah 1 =====");
        System.out.println("ID MatKul  : " + MK1.getIdMatKul());
        System.out.println("Nama  : " + MK1.getNama());
        System.out.println("SKS   : " + MK1.getSks());

        // Menggunakan parameter
        MataKuliah MK2 = new MataKuliah("IF102", "Struktur Data", 4);

        System.out.println("\n===== Mata Kuliah 2 =====");
        System.out.println("ID MatKul  : " + MK2.getIdMatKul());
        System.out.println("Nama  : " + MK2.getNama());
        System.out.println("SKS   : " + MK2.getSks());
    }
}