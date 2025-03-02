/* Nama File    : MKendaraan.java
 * Deskripsi    : Main class Kendaraan
 * Pembuat      : Gusti Ayu Genta Bhuana Paramitha / 24060123130110
 * Tanggal      : Minggu, 2 Maret 2025
 */

public class MKendaraan {
    public static void main(String[] args) {
        // Tanpa parameter
        Kendaraan K1 = new Kendaraan();
        K1.setNoPlat("B 1234 ABC");
        K1.setJenis("Mobil");

        System.out.println("===== Kendaraan 1 =====");
        System.out.println("No Plat : " + K1.getNoPlat());
        System.out.println("Jenis   : " + K1.getJenis());

        // Menggunakan parameter
        Kendaraan K2 = new Kendaraan("D 5678 XYZ", "Motor");

        System.out.println("\n===== Kendaraan 2 =====");
        System.out.println("No Plat : " + K2.getNoPlat());
        System.out.println("Jenis   : " + K2.getJenis());
    }
}